package com.nokhyun.daggerexam2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nokhyun.daggerexam2.di.Counter
import com.nokhyun.daggerexam2.di.DaggerExamComponent
import com.nokhyun.daggerexam2.di.ExamComponent

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.simpleName
    }

    // build, factory, create 차이점 알아볼 것!! (2020-10-22)
//    private val componentBuild: ExamComponent by lazy { DaggerExamComponent.builder().build() }
//    private val componentCreate: ExamComponent by lazy { DaggerExamComponent.create() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 2020.10.23일 까지
//        val candy = componentBuild.injectAndReturnSomeType(Candy())
//        Log.d(TAG, "component result: ${candy.candyName}")
//
//        // PersonA instance 생성 및 주입 결과 return
////        val personA = componentCreate.getPersonA()
//        val personA = componentBuild.getPersonA()
//        Log.d(TAG, "component PersonA: name: ${personA.name} age:${personA.age}")
//        println( "component PersonA: name: ${personA.name} age:${personA.age}")
////        Toast.makeText(this, personA.name, Toast.LENGTH_SHORT).show()
//
//        // inject에 파라미터값으로 PersonB instance를 넘겨줌으로써 PersonB에 해당 모듈에 있는 값들이 주입.
//        val personB = PersonB()
//        componentCreate.injectPersonB(personB)
////        Log.d(TAG, "component PersonB: name: ${personB.name} age: ${personB.age}")
//        Log.d(TAG, "component PersonB: name: ${personB.name}")
//        Toast.makeText(this, personB.age.toString(), Toast.LENGTH_SHORT).show()


        // 2020.10.26
//        val candy = DaggerExamComponent.builder().testInstance(Candy())
//        Log.d(TAG, "candy: $candy")

//        DaggerExamComponent.factory().create(this@MainActivity)

        // 2020. 10. 28, 11. 02
        val component = DaggerExamComponent.create()
        val counter = Counter()
        component.inject(counter)
//        counter.printLazy()
        counter.printProvider()


    }
}