package org.javaclub;

public class Processor {

    private NotificationService notificationService;

    public void process(String message) {
        this.notificationService.sendNotification(message);
    }
}
