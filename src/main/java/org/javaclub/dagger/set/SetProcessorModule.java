package org.javaclub.dagger.set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import org.javaclub.notification.EmailNotificationService;
import org.javaclub.notification.NotificationService;
import org.javaclub.notification.SmsNotificationService;


@Module
public class SetProcessorModule {

    @IntoSet
    @Provides
    static NotificationService provideSmsNotificationService() {
        return new SmsNotificationService();
    }

    @IntoSet
    @Provides
    static NotificationService provideEmailNotificationService() {
        return new EmailNotificationService();
    }
}
