package com.example.viewpager_practice.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager_practice.fragment.freeFragment
import com.example.viewpager_practice.fragment.majorFragment
import com.example.viewpager_practice.fragment.personalFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    val fragments = listOf(majorFragment(), freeFragment(), personalFragment())

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}