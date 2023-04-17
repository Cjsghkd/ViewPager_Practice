package com.example.viewpager_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_practice.adapter.ViewPagerAdapter
import com.example.viewpager_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewPager()
    }

    private fun initViewPager() {
        val viewPager = binding.viewpager
        val viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter
    }

}