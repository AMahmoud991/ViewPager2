package com.repo51.viewpager2.old_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.repo51.viewpager2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragmentAdapter = FragmentPagerAdapter(supportFragmentManager,fragmentCount = 10)

        view_pager.apply {
        adapter=fragmentAdapter
        }
    }

}
