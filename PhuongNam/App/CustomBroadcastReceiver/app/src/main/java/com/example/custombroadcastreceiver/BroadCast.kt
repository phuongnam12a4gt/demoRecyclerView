package com.example.custombroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BroadCast: BroadcastReceiver()
{
    override fun onReceive(p0: Context?, p1: Intent?) {
        TODO("Not yet implemented")
        if (MainActivity.myaction.equals(p1?.action))
        {
            var text=p1?.getStringExtra(MainActivity.mytext)
        }
    }

}