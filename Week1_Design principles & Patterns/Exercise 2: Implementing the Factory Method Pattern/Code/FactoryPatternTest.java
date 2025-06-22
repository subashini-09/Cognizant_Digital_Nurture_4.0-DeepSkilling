package com.example.factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("EMAIL");
        Notification n2 = factory.createNotification("SMS");
        Notification n3 = factory.createNotification("PUSH");

        n1.notifyUser();
        n2.notifyUser();
        n3.notifyUser();
    }
}
