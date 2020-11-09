package com.nokhyun.daggerexam2.di.module

import com.nokhyun.daggerexam2.Hello
import com.nokhyun.daggerexam2.di.model.Book
import com.nokhyun.daggerexam2.di.scope.UserScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class MyModule {

    @Provides
    @Hello
    fun provideHello() = "Hello"

    @Provides
    fun provideWorld() = " World"


    // Module에 Singleton 선언 시 Component에도 선언을 해주어야 함.
    @Provides
//    @Singleton
    @UserScope // Singleton으로 지정된 곳에는 사용할 수 없음 (Singleton과 마찬가지로 Component에 선언)
    fun provideBook() = Book()

}