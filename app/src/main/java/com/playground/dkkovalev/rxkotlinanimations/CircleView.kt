package com.playground.dkkovalev.rxkotlinanimations

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.View

class CircleView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private lateinit var paint: Paint

    init {
        init()
    }

    private fun init() {
        paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.style = Paint.Style.FILL
        paint.color = ContextCompat.getColor(context, android.R.color.holo_red_dark)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val w = width - (paddingLeft + paddingRight)
        val h = height - (paddingTop + paddingBottom)
        val r = Math.min(w, h) / 2
        val cx = paddingLeft + (w / 2)
        val cy = paddingTop + (h / 2)
        canvas?.drawCircle(cx.toFloat(), cy.toFloat(), r.toFloat(), paint)
    }
}