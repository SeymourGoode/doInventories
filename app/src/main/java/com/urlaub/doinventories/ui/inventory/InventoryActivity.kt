package com.urlaub.doinventories.ui.inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.urlaub.doinventories.R

class InventoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_button)

        val look = findViewById<Button>(R.id.button1)
        val move = findViewById<Button>(R.id.button2)
        val add = findViewById<Button>(R.id.button3)

        look.setOnClickListener {
            val intent = Intent(this, InventoryActivity::class.java)

            startActivity(intent)

        }
        move.setOnClickListener {
            val intent = Intent(this, InventoryActivity::class.java)

            startActivity(intent)

        }
        add.setOnClickListener {
            val intent = Intent(this, InventoryActivity::class.java)

            startActivity(intent)

        }

    }
}