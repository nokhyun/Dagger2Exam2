package com.nokhyun.daggerexam2.di

import com.nokhyun.daggerexam2.di.module.CandyModule
import dagger.Component

@Component(modules = [CandyModule::class])
interface ExamComponent {
    // 리턴값이 없는 멤버 인젝션 메소드
    fun injectSomeType(candy: Candy)
    // 리턴값이 존재하는 멤버 인젝션 메소드
    fun injectAndReturnSomeType(candy: Candy): Candy
}