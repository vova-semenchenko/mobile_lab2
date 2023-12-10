package com.example.lab2mobile.ui.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.lab2mobile.ui.tabs.PlaceholderFragment
import com.example.lab2mobile.R
import com.example.lab2mobile.ui.return_home.ReturnHomeFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3
)


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        if (position == 2)
        {
            return ReturnHomeFragment.newInstance();
        }
        return PlaceholderFragment.newInstance(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 3 total pages.
        return 3
    }
}