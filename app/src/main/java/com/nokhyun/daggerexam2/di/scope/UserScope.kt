package com.nokhyun.daggerexam2.di.scope

import javax.inject.Scope

// Singleton과 비슷한 개념이지만 lifecycle 관리 가능
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class UserScope