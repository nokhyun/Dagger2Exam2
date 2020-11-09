package com.nokhyun.daggerexam2.di.model

import com.nokhyun.daggerexam2.Hello
import javax.inject.Inject

class MyClass {

    @Inject
    @field:Hello
    lateinit var strHello: String

    @Inject
    lateinit var strWorld: String


}