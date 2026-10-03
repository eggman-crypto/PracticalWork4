package com.example.spider_man

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим все три компонента по ID
        val myButton: Button = findViewById(R.id.btnClick)
        val myImage: ImageView = findViewById(R.id.myImageView)
        val closeButton: Button = findViewById(R.id.buttonClose)

        // Обработчик для первой кнопки
        myButton.setOnClickListener {
            // Скрываем первую кнопку
            myButton.visibility = View.GONE
            // Показываем картинку и кнопку «Закрыть»
            myImage.visibility = View.VISIBLE
            closeButton.visibility = View.VISIBLE
        }

        // Обработчик для кнопки «Закрыть»
        closeButton.setOnClickListener {
            // Скрываем картинку и кнопку «Закрыть»
            myImage.visibility = View.GONE
            closeButton.visibility = View.GONE
            // Возвращаем первую кнопку
            myButton.visibility = View.VISIBLE
        }
    }
}