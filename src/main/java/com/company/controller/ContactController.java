package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.company.model.ContactMessage;
import com.company.service.ContactService;

@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://bhs-it.netlify.app"
})
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    public String receiveMessage(@RequestBody ContactMessage msg) {
        service.save(msg);
        return "Message received successfully!";
    }
}
