package com.nokhyun.daggerexam2.di.model.multibinding

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

/**
 * Set 멀티바인딩
 * Set<String> 타입으로 바인딩
 *
 * 2020. 11. 12
 * */
@Module
class SetModule {

    @Provides
    @IntoSet
    fun provideHello() = "Hello"

    @Provides
    @IntoSet
    fun provideWorld() = "World"

    @Provides
    @ElementsIntoSet
    fun provideSet() = HashSet<String>(arrayListOf("Wow", "Wow Wow")) as Set<String>
}