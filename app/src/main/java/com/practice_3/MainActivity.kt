package com.practice_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Тематический контент"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Создаем тестовые данные
        val items = listOf(
            CardItem(
                R.drawable.real,
                "Real Madrid",
                "La Liga"
            ),
            CardItem(
                R.drawable.chelsea,
                "Chelsea",
                "EPL"
            ),
            CardItem(
                R.drawable.barsa,
                "Barcelona",
                "La Liga"
            ),
            CardItem(
                R.drawable.bayer_m,
                "Bayern",
                "Bundesliga"
            ),
            CardItem(
                R.drawable.milan,
                "Milan",
                "Serie A"
            ),
            CardItem(
                R.drawable.psg,
                "PSG",
                "Liga 1"
            )
        )

        recyclerView.adapter = CardAdapter(items)
    }
} 