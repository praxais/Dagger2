package com.prajwal.dagger2

import android.support.v7.app.AppCompatActivity
import com.prajwal.dagger2.component.MainComponent
import javax.inject.Inject

/**
 * Created by prajwal on 1/24/18.
 */

class MainActivity : AppCompatActivity() {
    @Inject
    private lateinit var MainComponent
}