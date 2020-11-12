package com.nokhyun.daggerexam2.di.component

import com.nokhyun.daggerexam2.di.model.SetFoo
import com.nokhyun.daggerexam2.di.model.multibinding.SetModule
import dagger.Component

@Component(modules = [SetModule::class])
interface SetComponent {
    fun inject(setFoo: SetFoo)
}