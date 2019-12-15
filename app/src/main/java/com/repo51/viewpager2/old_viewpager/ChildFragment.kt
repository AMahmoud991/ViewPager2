package com.repo51.viewpager2.old_viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.repo51.viewpager2.R
import kotlinx.android.synthetic.main.fragment_child.*

class ChildFragment : Fragment() {
    private var currentFramgent = 0

    companion object {
        fun newInstance(currentFragment: Int): ChildFragment {

            val fragment = ChildFragment()
            val args = Bundle()
            args.putInt("current", currentFragment)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currentFramgent = if (arguments != null) arguments!!.getInt("current") else 1
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        content.text = currentFramgent.toString()

    }
}