package com.prajwal.dagger2.kotlin.module

import com.prajwal.dagger2.kotlin.model.Student
import dagger.Module
import dagger.Provides

/**
 * Created by prajwal on 1/25/18.
 */

@Module
class StudentModule {
    @Provides
    fun providesStudent() = Student("Prajwal", 22, "NCIT")
}