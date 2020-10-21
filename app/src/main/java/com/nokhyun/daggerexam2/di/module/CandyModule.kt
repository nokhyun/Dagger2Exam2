package com.nokhyun.daggerexam2.di.module

import com.nokhyun.daggerexam2.di.Candy
import dagger.Module
import dagger.Provides

@Module
class CandyModule {

    @Provides
    fun getCandy(): Candy = Candy()

}