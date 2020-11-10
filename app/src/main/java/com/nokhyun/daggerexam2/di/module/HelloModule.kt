package com.nokhyun.daggerexam2.di.module

import dagger.Module
import dagger.Provides

@Module
class HelloModule {
    @Provides
    fun provideString() = "Hello"
}