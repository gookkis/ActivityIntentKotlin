package com.gookkis.activityintentkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kedua.*

class KeduaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)


        tv_kedua.text = "Atvivity Kedua"

        val isi = intent.getStringExtra("isi")

        tv_kedua.text = isi

    }
}
