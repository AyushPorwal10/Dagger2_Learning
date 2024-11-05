package com.example.dagger2_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    // HERE this will shows that fields are need to Inject here (Field Inject)

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                             // this is without field Inject
                                        //this is red
        val component = DaggerUserRegistrationComponent.builder().NotificationServiceModule(3).build();


        component.inject(this)



        userRegistrationService.registerUser("demo@gmail.com","uhsughug")

    }
}