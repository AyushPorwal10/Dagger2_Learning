package com.example.dagger2_learning

import android.util.Log
import javax.inject.Inject

class UserRepo @Inject constructor(){
    fun saveUser (email : String, pass : String){
        Log.d("Testing","User saved in DB")
    }
}