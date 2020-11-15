package com.nokhyun.daggerexam2.di.model.multibinding

import com.nokhyun.daggerexam2.di.model.MapFoo
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class MapModule {

    @Provides
    @IntoMap
    @StringKey("foo")
    fun provideFooValue() = 100L

    @Provides
    @IntoMap
    @ClassKey(MapFoo::class)
    fun provideFooStr() = "Foo String"
}