package com.example.dagger2_learning

import android.util.Log
import javax.inject.Inject


interface NotificationService {
    fun send(to : String , from : String , body : String)
}
// here Inject will tell dagger how to create its object 
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("Testing","Email sent")
    }
}
class MessageService (private val retryCount : Int) : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("Testing","Email sent $retryCount")
    }
}









// assume a scenerio when in future we want that when user register he receive message instead of mail
// so here we can define a interface(NotificationService) that has method send and below we will take class like EmailService and MessageService that is
//going to implement NotificationService , we can update UserRegistration accordingly