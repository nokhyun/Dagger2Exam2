package com.nokhyun.daggerexam2.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CounterModule {
    var next: Int = 100

    @Provides
    fun provideInteger(): Lazy<Int>  {
        println("computing....")
        return lazyOf(next++)
    }
}