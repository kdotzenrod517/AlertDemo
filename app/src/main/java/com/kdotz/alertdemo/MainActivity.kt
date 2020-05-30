package com.kdotz.alertdemo

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlertDialog.Builder(this)
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setTitle("Are you sure!?")
            .setMessage("Do you definitely want to do this?")
            .setPositiveButton(
                "Yes"
            ) { _, _ ->
                Toast.makeText(this, "It's done", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No", null).show()
    }
}
