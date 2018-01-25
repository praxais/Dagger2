package com.prajwal.dagger2.java

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.prajwal.dagger2.R
import com.prajwal.dagger2.component.DaggerMainComponent
import com.prajwal.dagger2.component.MainComponent
import com.prajwal.dagger2.java.model.MyModel
import com.prajwal.dagger2.module.MainModule
import javax.inject.Inject

/**
 * Created by prajwal on 1/24/18.
 */

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var myModule: MyModel

    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainComponent = DaggerMainComponent.builder()
                .mainModule(MainModule())
                .build()

        mainComponent.inject(this)

        Log.d("Ar", myModule.test2.test.name)
    }
}