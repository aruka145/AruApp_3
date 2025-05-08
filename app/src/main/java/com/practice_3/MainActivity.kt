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
                R.drawable.art1,
                "Суп карри лакса из Куала-Лампура",
                ""
            ),
            CardItem(
                R.drawable.art2,
                "Токийские суши",
                ""
            ),
            CardItem(
                R.drawable.art3,
                "Говяжий брискет из Техаса",
                ""
            ),
            CardItem(
                R.drawable.art4,
                "Сморреброды из Копенгагена",
                ""
            ),
            CardItem(
                R.drawable.art5,
                "Раки из Кайкоры",
                ""
            )

        )

        recyclerView.adapter = CardAdapter(items)
    }
} 