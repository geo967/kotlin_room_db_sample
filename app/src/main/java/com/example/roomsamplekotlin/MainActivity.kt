package com.example.roomsamplekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomsamplekotlin.adapter.RecyclerViewAdapter
import com.example.roomsamplekotlin.databinding.ActivityMainBinding
import com.example.roomsamplekotlin.db.UserEntity

class MainActivity : AppCompatActivity(),RecyclerViewAdapter.RowClickListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerViewId.apply{
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=RecyclerViewAdapter()
        }
    }

    override fun onItemClickListener(user: UserEntity) {
        TODO("Not yet implemented")
    }
}