package ru.oktemsec.pr5_abramovkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import ru.oktemsec.pr5_abramovkotlin.screens.*

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val things:Array<String> = arrayOf("Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай")
        listView = findViewById<ListView>(R.id.recipe_list_view)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, things)
        listView.adapter = adapter

        val intent = Intent(this, Argentina::class.java)

        listView.setOnItemClickListener { parent, view, position, id ->
            when(position) {
                0 -> {
                    val intent1 = Intent(this, Argentina::class.java)
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
                    startActivity(intent1)
                }
                1 -> {
                    val intent2 = Intent(this, Brazil::class.java)
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
                    startActivity(intent2)
                }
                2 -> {
                    val intent3 = Intent(this, Chile::class.java)
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
                    startActivity(intent3)
                }
                3 -> {
                    val intent4 = Intent(this, Columbia::class.java)
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
                    startActivity(intent4)
                }
                4 -> {
                    val intent5 = Intent(this, Urugvai::class.java)
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
                    startActivity(intent5)
                }
            }
        }
    }
}