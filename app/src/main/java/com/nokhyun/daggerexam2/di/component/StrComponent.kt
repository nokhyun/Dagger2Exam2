package com.nokhyun.daggerexam2.di.component

import com.nokhyun.daggerexam2.Foo
import com.nokhyun.daggerexam2.di.module.CommonModule
import com.nokhyun.daggerexam2.di.module.HelloModule
import dagger.Component

//@Component(modules = [CommonModule::class, HelloModule::class])
interface StrComponent {
    fun inject(foo: Foo)
}