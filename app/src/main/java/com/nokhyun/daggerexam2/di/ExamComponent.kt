package com.nokhyun.daggerexam2.di

import android.content.Context
import com.nokhyun.daggerexam2.di.model.PersonA
import com.nokhyun.daggerexam2.di.model.PersonB
import com.nokhyun.daggerexam2.di.module.CandyModule
import com.nokhyun.daggerexam2.di.module.CounterModule
import com.nokhyun.daggerexam2.di.module.MyModule
import com.nokhyun.daggerexam2.di.module.PersonModule
import dagger.BindsInstance
import dagger.Component

//@Component(modules = [CandyModule::class, PersonModule::class, MyModule::class, CounterModule::class])
//@Component(modules = [CounterModule::class])
@Component(modules = [CandyModule::class])
interface ExamComponent {
    // 리턴값이 없는 멤버 인젝션 메소드
//    fun injectSomeType(candy: Candy)
    // 리턴값이 존재하는 멤버 인젝션 메소드
//    fun injectAndReturnSomeType(candy: Candy): Candy

    // 프로비전
//    fun getPersonA(): PersonA

    // 멤버 인젝션 메소드
//    fun injectPersonB(personB: PersonB)


    /*
    * Component에 modules, dependencies 선언된 요소들은 setter method로 선언해야함.
    * setter method는 하나의 매개변수만 가져야함. return type은 void, builder, super.builder type
    * Dagger2.12
    * */
//    @Component.Builder
//    interface Builder {
//        // setter method
//        fun setMyModule(myModeul: MyModule)
//
//        // setter method에 @BindsInstance를 붙이면 해당 컴포넌트에 인스턴스를 넘겨 바인드시킴.
//        @BindsInstance
//        fun testInstance(candy: Candy)
//        // build method (parameter 없어야함)
//        fun build(): ExamComponent
//
//    }


    /*
    * component, super.component를 반환하는 하나의 abstract method만 존재해야함.
    * Dagger 2.22
    * */
//    @Component.Factoryy
//    interface Factory{
        // 모듈내에 공통적으로 필요한 것들 적용하면 좋을듯함
        // 모듈에내 어디든지 context 사용가능
        // method에 @BindsInstance 붙은 parameter는 해당 component에 인스턴스를 넘겨 바인드 시킴.
//        fun create(@BindsInstance context: Context): ExamComponent
//    }



    // Lazy
//    fun inject(counter: Counter)


    // 2020. 11. 04
    fun inject(candy: Candy)

}