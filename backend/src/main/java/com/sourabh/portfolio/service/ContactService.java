package com.sourabh.portfolio.service;

import com.sourabh.portfolio.model.ContactRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContactService {

    private final JavaMailSender mailSender;

    @Value("${portfolio.contact.recipient}")
    private String recipientEmail;
    @Async
    public void sendContactEmail(ContactRequest request) {
        try {
            // 1. Notify you (The Owner)
            sendOwnerNotification(request);

            // 2. Send confirmation to the user (The Sender)
            sendAutoReply(request);

            log.info("Successfully processed emails for: {}", request.getEmail());
        } catch (MailException e) {
            log.error("Failed to send email: {}", e.getMessage());
            throw new RuntimeException("Email service is temporarily unavailable.");
        }
    }

    private void sendOwnerNotification(ContactRequest request) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(recipientEmail);
        message.setFrom(recipientEmail);
        message.setReplyTo(request.getEmail());
        message.setSubject(request.getSubject());
        message.setText(
                "New message from portfolio:\n\n" +
                        "Name: " + request.getName() + "\n" +
                        "Email: " + request.getEmail() + "\n\n" +
                        "Message:\n" + request.getMessage()
        );
        mailSender.send(message);
    }

    private void sendAutoReply(ContactRequest request) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(request.getEmail());
        message.setFrom(recipientEmail);
        message.setSubject("Thanks for reaching out, " + request.getName() + "!");
        message.setText(
                "Hi " + request.getName() + ",\n\n" +
                        "I've received your message and will get back to you shortly.\n\n" +
                        "Best regards,\nSourabh Awate"
        );
        mailSender.send(message);
    }
}