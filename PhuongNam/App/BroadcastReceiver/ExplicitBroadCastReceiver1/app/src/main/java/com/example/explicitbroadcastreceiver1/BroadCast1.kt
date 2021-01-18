package com.example.explicitbroadcastreceiver1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadCast1 : BroadcastReceiver() {
    companion object {
        private val MY_TEXT = "com.tincoder.text"
    }

    override fun onReceive(p0: Context?, p1: Intent?) {
        TODO("Not yet implemented")
        if (p0 != null && p1 != null) {
            var text: String ="MyBroadCast1"+p1.getStringExtra(MY_TEXT).toString()
            Toast.makeText(p0, text, Toast.LENGTH_LONG).show()
        }
    }

}