package com.example.demorecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutmanager1 :LinearLayoutManager?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutmanager1 = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val recyclerView=findViewById(R.id.recyclerview) as RecyclerView
        recyclerView.layoutManager=layoutmanager1
        val musics=ArrayList<Music>()
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Vô Tâm"))
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Vô Tâm"))
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Vô Tâm"))
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Vô Tâm"))
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Vô Tâm"))
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Vô Tâm"))
        musics.add(Music("Chi Dân","Có không giữ mất đừng tìm"))
        musics.add(Music("Hồ Quang Hiếu","Liên khúc đẹp trai"))
        val adapter=LinearLayoutAdapter(musics)
        recyclerView.adapter=adapter
        recyclerView.addItemDecoration(GridSpacingDecoration(1,2))
    }
}