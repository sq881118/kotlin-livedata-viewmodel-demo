package com.example.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.*

class EducationFragmentListAdapter(fragmentActivity: FragmentActivity, private var fragments: ArrayList<Fragment>?) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return fragments!![position]
    }

    override fun getItemCount(): Int {
        return fragments!!.size
    }

    fun updateData(fragments:ArrayList<Fragment>){
        this.fragments = fragments
        this.notifyDataSetChanged()
    }
}