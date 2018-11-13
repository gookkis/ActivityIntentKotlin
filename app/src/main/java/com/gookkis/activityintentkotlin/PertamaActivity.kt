package com.gookkis.activityintentkotlin

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pertama.*
import org.jetbrains.anko.*

class PertamaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertama)


        btn_browse.setOnClickListener {
            browse("https://www.gookkis.com")
        }

        btn_email.setOnClickListener {
            email("admin@gookkis.com", "Tes Email", "Isi Email")
        }

        btn_telepon.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {

                if (ActivityCompat.shouldShowRequestPermissionRationale(
                        this,
                        Manifest.permission.CALL_PHONE
                    )
                ) {

                } else {

                    ActivityCompat.requestPermissions(
                        this,
                        arrayOf(Manifest.permission.CALL_PHONE), 99
                    )
                }
            } else {
                makeCall("082124112")
            }


        }

        btn_send_text.setOnClickListener {
            sendSMS("0812141242", "Isi SMS ")
        }

        btn_share.setOnClickListener {
            share("Isi Share", "Subject")
        }

        btn_pindah.setOnClickListener {
            startActivity<KeduaActivity>("isi" to "Ini Isi data")
            //finish()
        }

    }
}
