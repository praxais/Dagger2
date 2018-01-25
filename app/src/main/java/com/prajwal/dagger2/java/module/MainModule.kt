package com.prajwal.dagger2.module

import com.prajwal.dagger2.java.model.MyModel
import com.prajwal.dagger2.java.model.MyModelI
import dagger.Module
import dagger.Provides

/**
 * Created by prajwal on 1/24/18.
 */

@Module
class MainModule {
    @Provides
    fun provideData(model: MyModel): MyModelI = model
}