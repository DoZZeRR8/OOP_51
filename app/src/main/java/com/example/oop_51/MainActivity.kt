package com.example.oop_51

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oop_51.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var news = getNews()
        binding.rvNews.adapter = NewsAdapter(news, this)
        binding.rvNews.layoutManager = LinearLayoutManager(this)
    }

    fun getNews(): ArrayList<News>{
        var news = ArrayList<News>()
        news.add(News(
            "SNN",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Social, Economic, Politic",
            BitmapFactory.decodeResource(getResources(), R.drawable.img1)
        ))
        news.add(News(
            "NewsWatch",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Breaking, Global, Investigative",
            BitmapFactory.decodeResource(getResources(), R.drawable.img2)
        ))
        news.add(News(
            "L!FENEWS",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Lifestyle, Wellness, Travel",
            BitmapFactory.decodeResource(getResources(), R.drawable.img3)
        ))
        news.add(News(
            "skySPORTSNEWS",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Formula 1, Live, Football",
            BitmapFactory.decodeResource(getResources(), R.drawable.img4)
        ))
        news.add(News(
            "NCN",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "National, News, Events",
            BitmapFactory.decodeResource(getResources(), R.drawable.img5)
        ))
        news.add(News(
            "Forbes",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Business, Finance, Leadership",
            BitmapFactory.decodeResource(getResources(), R.drawable.img6)
        ))
        news.add(News(
            "SNN",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Social, Economic, Politic",
            BitmapFactory.decodeResource(getResources(), R.drawable.img1)
        ))
        news.add(News(
            "NewsWatch",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Breaking, Global, Investigative",
            BitmapFactory.decodeResource(getResources(), R.drawable.img2)
        ))
        news.add(News(
            "L!FENEWS",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Lifestyle, Wellness, Travel",
            BitmapFactory.decodeResource(getResources(), R.drawable.img3)
        ))
        news.add(News(
            "skySPORTSNEWS",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Formula 1, Live, Football",
            BitmapFactory.decodeResource(getResources(), R.drawable.img4)
        ))
        news.add(News(
            "NCN",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "National, News, Events",
            BitmapFactory.decodeResource(getResources(), R.drawable.img5)
        ))
        news.add(News(
            "Forbes",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Business, Finance, Leadership",
            BitmapFactory.decodeResource(getResources(), R.drawable.img6)
        ))
        news.add(News(
            "SNN",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Social, Economic, Politic",
            BitmapFactory.decodeResource(getResources(), R.drawable.img1)
        ))
        news.add(News(
            "NewsWatch",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Breaking, Global, Investigative",
            BitmapFactory.decodeResource(getResources(), R.drawable.img2)
        ))
        news.add(News(
            "L!FENEWS",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Lifestyle, Wellness, Travel",
            BitmapFactory.decodeResource(getResources(), R.drawable.img3)
        ))
        news.add(News(
            "skySPORTSNEWS",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Formula 1, Live, Football",
            BitmapFactory.decodeResource(getResources(), R.drawable.img4)
        ))
        news.add(News(
            "NCN",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "National, News, Events",
            BitmapFactory.decodeResource(getResources(), R.drawable.img5)
        ))
        news.add(News(
            "Forbes",
            "      Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Business, Finance, Leadership",
            BitmapFactory.decodeResource(getResources(), R.drawable.img6)
        ))
        return news
    }

}