package com.jongdroid.jongdroid_family_talk.ui.screen.intro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.jongdroid.jongdroid_family_talk.MainActivity
import com.jongdroid.jongdroid_family_talk.databinding.ActivityIntroBinding

// viewBinding
private lateinit var binding: ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // AnimationView Binding
        val animationView = binding.lottieIntroAnimation as LottieAnimationView
        // start Animation
        animationView.playAnimation()

        // Intro Screen delay 3 seconds
        val handler: Handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 3000)

    }
}