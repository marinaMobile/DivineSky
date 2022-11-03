package com.hagstrom.h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hagstrom.h.databinding.ActivityGammmmBinding
import com.hagstrom.h.databinding.ActivityWeeeebBinding
import java.util.*

class Gammmm : AppCompatActivity() {
    lateinit var bind: ActivityGammmmBinding
    val random = Random()
    fun getRandom(min: Float, max: Float): Float {
        require(min < max) { "Invalid range [$min, $max]" }
        return min + random.nextFloat() * (max - min)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityGammmmBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }

    override fun onStart() {
        super.onStart()
        bind.ball.setOnClickListener{
            translater()
        }
    }

    private fun translater() {
        val min = 0.0f
        val max = 1.0f
        val randomTwo = getRandom(min, max)
        val animation = bind.ball.animate()
            .x(randomTwo * (bind.llWs.width-bind.ball.width))
            .y(randomTwo * (bind.llWs.height-bind.ball.height))

        animation.duration = 300
        animation.start()

    }
}
