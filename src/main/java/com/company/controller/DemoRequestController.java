package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.company.model.DemoRequest;
import com.company.service.DemoRequestService;

@RestController
@RequestMapping("/api/demo-request")
public class DemoRequestController {

    @Autowired
    private DemoRequestService service;

    @PostMapping
    public ResponseEntity<String> handleDemo(
            @RequestBody DemoRequest req) {

        service.send(req);

        return ResponseEntity.ok(
            "Demo request sent successfully! We will get back to you soon."
        );
    }
}
