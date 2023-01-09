package com.rossella_morgante.rossellalib

import android.content.Context
import android.content.Intent

class NativeLib(val context: Context) {

    /**
     * A native method that is implemented by the 'rossellalib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'rossellalib' library on application startup.
        init {
            System.loadLibrary("rossellalib")
        }
    }
    fun startRossalla(){
        var intent = Intent(context, RossellaActivity::class.java)
        context.startActivity(intent)
    }
}