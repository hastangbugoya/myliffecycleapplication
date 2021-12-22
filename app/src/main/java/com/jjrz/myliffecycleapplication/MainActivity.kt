package com.jjrz.myliffecycleapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.jjrz.a20211212_jeffreyzacal_nycschools.utility.DebugHelper.Companion.LogKitty


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogKitty("MainActiviy>onCreate")
        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            val bundle = Bundle()
            bundle.putString(
                "value",
                "Yay"
            )
            intent.putExtras(bundle)
            startActivity(intent, null)
        }
    }

    override fun onStart() {
        super.onStart()
        LogKitty("MainActiviy>onstart")
    }

    override fun onResume() {
        super.onResume()
        LogKitty("MainActiviy>onResume")
    }

    override fun onPause() {
        super.onPause()
        LogKitty("MainActiviy>onPause")
    }

    override fun onStop() {
        super.onStop()
        LogKitty("MainActiviy>onStop")
    }

    override fun onTopResumedActivityChanged(isTopResumedActivity: Boolean) {
        LogKitty("MainActiviy>onTopResumedActivityChanged")
        super.onTopResumedActivityChanged(isTopResumedActivity)
    }

    override fun onPostResume() {
        super.onPostResume()
        LogKitty("MainActivity>onPostResume")
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        LogKitty("MainActivity>onResumeFragments")
    }

    override fun onDestroy() {
        LogKitty("MainActiviy>onDestroy")
        super.onDestroy()
    }
}