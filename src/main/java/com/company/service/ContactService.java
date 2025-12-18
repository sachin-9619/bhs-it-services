package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.company.model.ContactMessage;

@Service
public class ContactService {

    @Autowired
    private JavaMailSender mailSender;

    public void save(ContactMessage msg) {
        // Send email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("sachinmore85395@gmail.com"); // recipient
        message.setSubject("New Contact Message from " + msg.getName());
        message.setText(
            "Name: " + msg.getName() + "\n" +
            "Email: " + msg.getEmail() + "\n" +
            "Phone: " + msg.getPhone() + "\n\n" +
            "Message:\n" + msg.getMessage()
        );

        mailSender.send(message);
    }
}
