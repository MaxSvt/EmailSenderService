package com.split.emailsender.sevice;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
