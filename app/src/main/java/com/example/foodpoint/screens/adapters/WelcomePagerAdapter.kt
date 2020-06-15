package com.example.foodpoint.screens.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.foodpoint.R
import com.example.foodpoint.classes.ViewPagerCard
import kotlinx.android.synthetic.main.welcome_page_view.view.*


class WelcomePagerAdapter(private val context: Context?,private val listOfCards:ArrayList<ViewPagerCard>) : PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as LinearLayout
    }

    override fun getCount(): Int {
        return listOfCards.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(this.context).inflate(R.layout.welcome_page_view, container, false)
        view.titleTextView.text = listOfCards[position].title
        view.descriptionTextView.text = listOfCards[position].description
        container.addView(view)
        return view
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }


}