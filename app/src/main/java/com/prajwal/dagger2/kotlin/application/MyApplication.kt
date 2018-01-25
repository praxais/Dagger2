package com.prajwal.dagger2.kotlin.application

import android.app.Application
import android.util.Log
import com.prajwal.dagger2.kotlin.component.DaggerStudentComponent
import com.prajwal.dagger2.kotlin.component.StudentComponent
import com.prajwal.dagger2.kotlin.model.Student
import com.prajwal.dagger2.kotlin.module.StudentModule
import javax.inject.Inject

/**
 * Created by prajwal on 1/25/18.
 */

class MyApplication : Application() {
    @Inject
    lateinit var student: Student
    private lateinit var studentComponent: StudentComponent

    override fun onCreate() {
        super.onCreate()
        studentComponent = DaggerStudentComponent.builder()
                .studentModule(StudentModule())
                .build()
        studentComponent.inject(this)

        Log.d("Student", student.name + "->" + student.college + "->" + student.rollNumber)
    }
}