package com.prajwal.dagger2.component

import com.prajwal.dagger2.module.MainModule
import dagger.Component

/**
 * Created by prajwal on 1/24/18.
 */

@Component(modules = [MainModule::class])
interface MainComponent {
    fun inject()
}