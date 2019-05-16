package org.javaclub.notification;

public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message + " " + this.toString());
    }
}
