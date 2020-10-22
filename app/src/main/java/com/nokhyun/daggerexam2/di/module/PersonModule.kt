package com.nokhyun.daggerexam2.di.module

import dagger.Module
import dagger.Provides

@Module
class PersonModule {

    @Provides
    fun provideName() = "Nokhyun"

    @Provides
    fun provideAge() = 20
}