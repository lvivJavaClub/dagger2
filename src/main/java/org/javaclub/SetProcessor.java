package org.javaclub;

import org.javaclub.notification.NotificationService;

import javax.inject.Inject;
import java.util.Set;

public class SetProcessor implements Processor {


    Set<NotificationService> notificationServiceSet;

    @Inject
    public SetProcessor(Set<NotificationService> notificationServiceSet) {
        this.notificationServiceSet = notificationServiceSet;
    }

    @Override
    public void process(String message) {
        notificationServiceSet.forEach(notificationService -> notificationService.sendNotification(message));
    }
}
