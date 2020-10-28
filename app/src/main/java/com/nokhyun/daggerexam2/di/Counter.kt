package com.nokhyun.daggerexam2.di

import javax.inject.Inject
import javax.inject.Singleton

class Counter{
    @Inject
    lateinit var lazy: Lazy<Int>

    fun printLazy(){
        println("printing...")
        println(lazy.value)
        println(lazy.value)
        println(lazy.value)
    }
}