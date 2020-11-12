package com.nokhyun.daggerexam2.di.model

import javax.inject.Inject

class SetFoo {
    @Inject
    lateinit var strings: Set<String>

    fun print(){
        strings.iterator().forEach {
            println(it)
        }

    }
}