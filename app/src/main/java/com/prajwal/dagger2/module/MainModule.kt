package com.prajwal.dagger2.module

import com.prajwal.dagger2.model.MyModel
import dagger.Module
import dagger.Provides

/**
 * Created by prajwal on 1/24/18.
 */

@Module
class MainModule(private val firstName: String,
                 private val lastName: String) {
    @Provides
    fun getData() = MyModel(firstName, lastName)
}