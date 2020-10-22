package com.nokhyun.daggerexam2.di.model

import javax.inject.Inject

// field inject
class PersonB {

    // Field (Module에 같은 타입과 연결)
    @Inject
    lateinit var name: String

    // method (Module에 같은 타입과 연결)
    var age: Int = 0
        @Inject set

}