package com.example.viewpager_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager_practice.adapter.ViewPagerAdapter
import com.example.viewpager_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewPager()
        initNavigation()
    }

    private fun initViewPager() {
        val viewPager = binding.viewpager
        val viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.bottomNavigation.menu.getItem(position).isChecked = true
            }
        })
    }

    private fun initNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_major -> {
                    binding.viewpager.currentItem = 0
                    return@setOnItemSelectedListener true
                }
                R.id.item_free -> {
                    binding.viewpager.currentItem = 1
                    return@setOnItemSelectedListener true
                }
                R.id.item_personal -> {
                    binding.viewpager.currentItem = 2
                    return@setOnItemSelectedListener true
                }
                else -> {
                    binding.viewpager.currentItem = 3
                    return@setOnItemSelectedListener false
                }
            }
        }
    }

}