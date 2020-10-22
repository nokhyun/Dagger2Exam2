package com.nokhyun.daggerexam2.di.model

import javax.inject.Inject

// constructor inject
data class PersonA @Inject constructor(var name: String, var age: Int?)


