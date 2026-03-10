package com.sourabh.portfolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF for API calls
                .csrf(csrf -> csrf.disable())
                // Enable CORS using the CorsConfig bean we created
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(auth -> auth
                        // Be very specific with the path
                        .requestMatchers("/api/contact").permitAll()
                        .requestMatchers("/api/**").permitAll()
                        .anyRequest().authenticated()
                )
                // This ensures the 401 doesn't trigger a login popup
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
