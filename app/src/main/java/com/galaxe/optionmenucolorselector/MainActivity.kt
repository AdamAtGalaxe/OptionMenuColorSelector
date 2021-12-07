package com.galaxe.optionmenucolorselector

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var myLayout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLayout = findViewById(R.id.mylay);
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.color_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.red -> myLayout.setBackgroundColor(getResources().getColor(R.color.red))
            R.id.orange -> myLayout.setBackgroundColor(getResources().getColor(R.color.orange))
            R.id.green -> myLayout.setBackgroundColor(getResources().getColor(R.color.green))
            R.id.exit -> finish()
        }
        return true
    }
}