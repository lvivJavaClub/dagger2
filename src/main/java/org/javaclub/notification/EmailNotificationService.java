package org.javaclub.notification;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message + " " + this.toString());
    }
}
