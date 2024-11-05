package com.example.dagger2_learning

import dagger.Component

@Component(modules = [NotificationService::class])

interface UserRegistrationComponent {
//    fun getUserRegistrationService() : UserRegistrationService

    // if we need 50 dependency we need to make 50 methods like above one
    // to solve this we will be using below concept , we can remove above method if we are using this


    // Here MainActivity is Consumer
    // I pass obj and tell those who have @Inject annotation , provide me those objects
    fun inject(mainActivity: MainActivity)

    // below is concept of Component Factory
    interface Factory{
        fun create(tryCount : Int) : UserRegistrationComponent
    }
}