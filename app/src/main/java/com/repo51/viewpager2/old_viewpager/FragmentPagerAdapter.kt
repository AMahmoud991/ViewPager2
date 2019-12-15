package com.repo51.viewpager2.old_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentPagerAdapter(fm: FragmentManager, behavior: Int=FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,var fragmentCount: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int =
        fragmentCount

    override fun getItem(position: Int): Fragment {
        return ChildFragment.newInstance(position)
    }
}