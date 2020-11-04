package com.nokhyun.daggerexam2.di.module

import com.nokhyun.daggerexam2.di.Candy
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CandyModule {

//    @Provides
//    fun getCandy(): Candy = Candy()

    @Provides
    @Named("candy1")
    fun getCandyName1() = "Candy1"

    @Provides
    @Named("candy2")
    fun getCandyName2() = "Candy2"

}