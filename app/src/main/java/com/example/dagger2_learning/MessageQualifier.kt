package com.example.dagger2_learning

import java.lang.annotation.Documented

@jakarta.inject.Qualifier
@Documented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)     // kab tak valid rahegi
annotation class MessageQualifier()
