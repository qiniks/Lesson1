package com.example.lesson1.ui.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.lesson1.R
import com.example.lesson1.databinding.FragmentOnBoardingPageBinding
import com.example.lesson1.ui.OnBoard
import com.example.lesson1.ui.loadImage

class OnBoardingPageFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val data = it.getSerializable(KEY_FOR_BOARD) as OnBoard
            binding.tvTittle.text = data.title
            binding.tvDescription.text = data.description
            binding.imagePage.loadImage(data.image)
            binding.btnStart.isVisible = data.isLast == true
            binding.skip.isVisible = data.isLast == false
        }
        binding.btnStart.setOnClickListener{
            findNavController().navigate(R.id.navigation_home)
        }
        binding.skip.setOnClickListener{
            findNavController().navigate(R.id.navigation_home)
        }
    }

   companion object{
       const val KEY_FOR_BOARD = "board.item"
   }
}