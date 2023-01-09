package com.rossella_morgante.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rossella_morgante.rossellalib.NativeLib

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Intent myIntent = new Intent(CurrentActivity.this, NextActivity.class);
        //myIntent.putExtra("key", value); //Optional parameters
        //CurrentActivity.this.startActivity(myIntent);
        var lib = NativeLib(this)
        lib.startRossalla()
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
    }
}