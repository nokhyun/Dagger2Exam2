package com.nokhyun.daggerexam2.di.module

import dagger.Binds
import dagger.BindsOptionalOf
import dagger.Module

@Module
abstract class CommonModule {
    /*
    * Optinal은 Nullable 바인딩에 대해 컴파일 타임 에러 발생
    * */
    @BindsOptionalOf
    abstract fun bindsOptionalOfString(): String

    /*
    * 추상메소드에 사용 가능
    * 반드시 하나의 매개변수만 가져야 함
    * 반환형으로 바인드 가능
    *  @Provides 메소드 대신 좀 더 효율적으로 사용가능
    * */
    @Binds
    abstract fun bindRandom(aa: Int): Int
}