package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.company.model.DemoRequest;

@Service
public class DemoRequestService {

    @Autowired
    private JavaMailSender mailSender;

    public void send(DemoRequest req) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("sachinmore85395@gmail.com");  // aapka email
        message.setSubject("New Demo Request for " + req.getProduct());

        message.setText(
            "Product: " + req.getProduct() + "\n" +
            "Name: " + req.getName() + "\n" +
            "Email: " + req.getEmail() + "\n" +
            "Phone: " + req.getPhone() + "\n\n" +
            "Message:\n" + req.getMessage()
        );

        mailSender.send(message);
    }
}
