package com.prajwal.dagger2.kotlin.component

import com.prajwal.dagger2.kotlin.application.MyApplication
import com.prajwal.dagger2.kotlin.module.StudentModule
import dagger.Component

/**
 * Created by prajwal on 1/25/18.
 */

@Component(modules = [StudentModule::class])
interface StudentComponent {
    fun inject(application: MyApplication)
}