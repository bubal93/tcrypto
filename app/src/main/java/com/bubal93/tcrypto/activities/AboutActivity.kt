package com.bubal93.tcrypto.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bubal93.tcrypto.R

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }
}
