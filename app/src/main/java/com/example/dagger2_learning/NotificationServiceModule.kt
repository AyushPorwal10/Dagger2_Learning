package com.example.dagger2_learning

import dagger.Module
import dagger.Provides
import jakarta.inject.Named

@Module
class NotificationServiceModule() {
    @Named("email")  // if here named than use named in UserRegistrationService as well
    @Provides
    fun emailService() : NotificationService{
        return EmailService()
    }
    @MessageQualifier    // if here Qualifier than use Qualifier in UserRegistrationService as well
    @Provides
    fun messageService(retryCount :Int) : NotificationService{
        return MessageService(retryCount)
    }
}