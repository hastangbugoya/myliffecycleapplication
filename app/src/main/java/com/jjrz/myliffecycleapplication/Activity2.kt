package com.jjrz.myliffecycleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jjrz.a20211212_jeffreyzacal_nycschools.utility.DebugHelper

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        DebugHelper.LogKitty("Activty2>onCreate")
    }
    override fun onStart() {
        super.onStart()
        DebugHelper.LogKitty("Activty2>onstart")
    }

    override fun onResume() {
        super.onResume()
        DebugHelper.LogKitty("Activty2>onResume")
    }

    override fun onPause() {
        super.onPause()
        DebugHelper.LogKitty("Activty2>onPause")
    }

    override fun onStop() {
        super.onStop()
        DebugHelper.LogKitty("Activty2>onStop")
    }

    override fun onTopResumedActivityChanged(isTopResumedActivity: Boolean) {
        DebugHelper.LogKitty("Activty2>onTopResumedActivityChanged")
        super.onTopResumedActivityChanged(isTopResumedActivity)
    }

    override fun onPostResume() {
        super.onPostResume()
        DebugHelper.LogKitty("Activty2>onPostResume")
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        DebugHelper.LogKitty("Activty2>onResumeFragments")
    }

    override fun onDestroy() {
        DebugHelper.LogKitty("Activty2>onDestroy")
        super.onDestroy()
    }
}