package com.playground.dkkovalev.rxkotlinanimations

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AccelerateDecelerateInterpolator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: CircleView = findViewById(R.id.button_1)
        val button2: CircleView = findViewById(R.id.button_2)
        val interpolator = AccelerateDecelerateInterpolator()
        button1.fadeIn(1000L).mergeWith(button2.slideY(1500F, duration = 2000, interpolator = interpolator))
                .andThen(button1.slideX(100F, 1000, interpolator))
                .andThen(button1.slideY(1000F, 1000, interpolator))
                .subscribe()
    }
}
