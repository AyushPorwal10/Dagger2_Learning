package com.example.dagger2_learning

import javax.inject.Inject

class UserRegistrationService @Inject constructor (private val userRepo: UserRepo, @MessageQualifier private val notificationService: NotificationService) {

    fun registerUser(email : String , pass : String){
        userRepo.saveUser(email , pass)
        notificationService.send(email , "ayushporwal1010@gmail.com","Welcome to our Team")
    }
}