package com.nokhyun.daggerexam2.di

import javax.inject.Inject
import javax.inject.Named

//class Candy @Inject constructor() {
class Candy {

    /*
    *    @Inject
    *    에러난 이유는 멤버인젝션 메소드의 파라미터값이 Candy 인데 String 에 다가 Inject 를 붙여버리니까 Component 에서
    *    Candy 로 주입을 시켰는데 주입받는 타입이 String 이여서 때문에 에러가 발생함.
    * */
    var candyName = "사탕"

    @Inject
    @field:Named("candy1")
    lateinit var candy1: String

    @Inject
    @field:Named("candy2")
    lateinit var candy2: String

}