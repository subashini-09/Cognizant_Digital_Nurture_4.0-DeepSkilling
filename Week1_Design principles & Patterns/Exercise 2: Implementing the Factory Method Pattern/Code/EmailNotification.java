package com.example.factory;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}
