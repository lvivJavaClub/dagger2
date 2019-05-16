package org.javaclub.dagger.single;

import dagger.Module;
import dagger.Provides;
import org.javaclub.notification.EmailNotificationService;
import org.javaclub.notification.NotificationService;
import org.javaclub.notification.SmsNotificationService;

import javax.inject.Named;

@Module
public class SingleProcessorModule {
    @Provides @Named("SMS") static NotificationService provideSmsNotificationService() {
        return new SmsNotificationService();
    }

    @Provides @Named("Email") static NotificationService provideEmailNotificationService() {
        return new EmailNotificationService();
    }
}
