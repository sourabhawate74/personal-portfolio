package com.sourabh.portfolio.controller;

import com.sourabh.portfolio.model.ApiResponse;
import com.sourabh.portfolio.model.ContactRequest;
import com.sourabh.portfolio.service.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // Allows your frontend to talk to the backend
@CrossOrigin(origins = {"http://127.0.0.1:5500","http://localhost:5500","https://sourabhawate74.github.io"})
public class ContactController {

    @Autowired
    private final ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Map<String, Object>> handleContact(@Valid @RequestBody ContactRequest request) {
        log.info("Received contact request from: {}", request.getEmail());

        // Call the service logic to send the two emails
        contactService.sendContactEmail(request);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Message received! Check your inbox for a confirmation.");

        return ResponseEntity.ok(response);
    }
}
