package com.split.emailsender.controller;

import com.split.emailsender.Entity.EmailMessage;
import com.split.emailsender.sevice.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmailController {

    @Autowired
    private final EmailSenderService emailSenderService;

    @PostMapping("/send-email")
    public ResponseEntity<?> sendEmail(@RequestBody EmailMessage emailMessage){
        emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
        return ResponseEntity.ok("Success");
    }
}
