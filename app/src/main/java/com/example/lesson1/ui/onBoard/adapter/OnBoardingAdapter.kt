package com.example.lesson1.ui.onBoard.adapter

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.lesson1.ui.OnBoard
import com.example.lesson1.ui.onBoard.OnBoardingPageFragment

class OnBoardingAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val arrayListBoarding =
        arrayListOf(
            OnBoard(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Orange-Fruit-Pieces.jpg/2560px-Orange-Fruit-Pieces.jpg",
                "Text 1",
                "Description 1",
                false
            ),
            OnBoard(
                "https://ru.m.wikinews.org/wiki/Файл:Facebook_Logo_%282019%29.png",
                "Text 2",
                "Description 2",
                false
            ),
            OnBoard(
                "https://ru.m.wikinews.org/wiki/Файл:Facebook_Logo_%282019%29.png",
                "Text 3",
                "Description 3",
                true
            )
        )

    override fun getCount(): Int = arrayListBoarding.size

    override fun getItem(position: Int): Fragment {
        val data = bundleOf(OnBoardingPageFragment.KEY_FOR_BOARD to arrayListBoarding[position])
        val fragment = OnBoardingPageFragment()
        fragment.arguments = data
        return fragment
    }
}