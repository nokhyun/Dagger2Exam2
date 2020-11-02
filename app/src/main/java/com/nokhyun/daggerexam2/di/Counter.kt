package com.nokhyun.daggerexam2.di

import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton
import kotlin.properties.Delegates

class Counter {
    //    @Inject
//    lateinit var lazy: Lazy<Int>
//
//    fun printLazy(){
//        println("printing...")
//        println(lazy.value)
//        println(lazy.value)
//        println(lazy.value)
//    }
    /*
    * 객체를 non-null 타입으로 만듬
    * primitive type 도 사용가능
    * lateinit 보다 더 무거움
    * Dagger2 와 같은 injection 라이브러리와 함께 쓰기 어려울 수 있음
    * */
    var provider by Delegates.notNull<Int>()
        @Inject set

    fun printProvider() {
        println("printing...")
        println(provider)
    }
}