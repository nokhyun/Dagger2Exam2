package com.nokhyun.daggerexam2.di.component

import com.nokhyun.daggerexam2.di.model.MapFoo
import com.nokhyun.daggerexam2.di.model.multibinding.MapModule
import dagger.Component

@Component(modules = [MapModule::class])
interface MapComponent {
    fun getLongsByString(): Map<String, Long>
    fun getStringsByClass(): Map<Class<*>, String>
}