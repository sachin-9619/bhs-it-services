package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.company.model.DemoRequest;
import com.company.service.DemoRequestService;

@RestController
@CrossOrigin("*")
public class DemoRequestController {

    @Autowired
    private DemoRequestService service;

    @PostMapping("/api/demo-request")
    public String handleDemo(@RequestBody DemoRequest req) {
        service.send(req);
        return "Demo request sent successfully!"
        		+ " We will get back to you soon.";
    }
}
