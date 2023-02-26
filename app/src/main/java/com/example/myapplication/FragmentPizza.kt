package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.namespace.R

import com.example.namespace.databinding.FragmentPizzaBinding

class FragmentPizza : Fragment() {
    var binding: FragmentPizzaBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPizzaBinding.inflate(layoutInflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val lisOfData = listOf(
            RowData(
                R.drawable.pizza1,
                "SNKAYIN",
                "TIKOI MOT",
                R.drawable.heart,
                R.drawable.basket
            ),
            RowData(
                R.drawable.pizza1,
                "PEPERONI",
                "ARAMI MOT",
                R.drawable.heart,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza3,
                "NEAPOLITANAKAN",
                "VARDANI MOT",
                R.drawable.heart,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza4,
                "ZEJTUNOV",
                "ASHOTI MOT",
                R.drawable.heart,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza5,
                "LOLIKOV",
                "KAROI MOT",
                R.drawable.heart,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza6,
                "PANIROV",
                "GAGASI MOT",
                R.drawable.heart,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza7,
                "IMERETAKAN",
                "HAMOV HOTOV",
                R.drawable.heart,
                R.drawable.basket
            )
        )


        val customAdapter = PiccaAdapter(context = requireContext(), data = lisOfData)
        binding?.recyclerContainer?.adapter = customAdapter
    }

}