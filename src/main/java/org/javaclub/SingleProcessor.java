package org.javaclub;

import org.javaclub.notification.NotificationService;

import javax.inject.Inject;
import javax.inject.Named;

public class SingleProcessor implements Processor {

    NotificationService notificationService;

    @Inject
    public SingleProcessor(@Named("SMS") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void process(String message) {
        this.notificationService.sendNotification(message);
    }
}
