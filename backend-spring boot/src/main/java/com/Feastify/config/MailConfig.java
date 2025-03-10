package com.Feastify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        // Configure mail sender properties such as host, port, username, password, etc.
        // Example configuration:
        mailSender.setHost("your.mail.host");
        mailSender.setPort(587);
        mailSender.setUsername("your.username");
        mailSender.setPassword("your.password");
        return mailSender;
    }
}
