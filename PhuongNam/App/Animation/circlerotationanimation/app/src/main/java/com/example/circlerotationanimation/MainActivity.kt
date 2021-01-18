package com.example.circlerotationanimation

import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var mcircleimageview: CircleImageView
    private lateinit var mstartanimation: Button
    private lateinit var mstopanimation: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mcircleimageview = findViewById(R.id.thiennhien)
        mstartanimation = findViewById(R.id.btn_start_animation)
        mstopanimation = findViewById(R.id.btn_stop_animation)
        mstartanimation?.setOnClickListener {
            startanimation()
        }
        mstopanimation?.setOnClickListener {
            stopAnimation()
        }
    }


    private fun startanimation() {
        var runable: Runnable = object : Runnable {
            override fun run() {
                mcircleimageview?.animate()?.rotationBy(90f)?.withEndAction(this)
                    ?.setDuration(10000)
                    ?.setInterpolator(LinearInterpolator())?.start()
            }
        }
        mcircleimageview?.animate()?.rotationBy(90f)?.withEndAction(runable)
            ?.setDuration(10000)
            ?.setInterpolator(LinearInterpolator())?.start()
    }

    private fun stopAnimation() {
        mcircleimageview?.animate()?.cancel()
    }
}