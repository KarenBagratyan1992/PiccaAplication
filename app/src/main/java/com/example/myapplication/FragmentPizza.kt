package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.namespace.R

import com.example.namespace.databinding.FragmentPizzaBinding
import kotlinx.coroutines.NonDisposableHandle.parent

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
                R.drawable.heartin,
                R.drawable.basket
            ),
            RowData(
                R.drawable.pizza1,
                "PEPERONI",
                "ARAMI MOT",
                R.drawable.heartin,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza3,
                "PAK PANROV",
                "VARDANI MOT",
                R.drawable.heartin,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza4,
                "ZEJTUNOV",
                "ASHOTI MOT",
                R.drawable.heartin,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza5,
                "LOLIKOV",
                "KAROI MOT",
                R.drawable.heartin,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza6,
                "PANIROV",
                "GAGASI MOT",
                R.drawable.heartin,
                R.drawable.basket
            ), RowData(
                R.drawable.pizza7,
                "MSOV",
                "HAMOV HOTOV",
                R.drawable.heartin,
                R.drawable.basket
            )
        )


        val customAdapter = PiccaAdapter(context = requireContext(), data = lisOfData)
        binding?.recyclerContainer?.adapter = customAdapter
        customAdapter.basketListener = {

            Navigation.findNavController(view)
                .navigate(R.id.action_fragmentPizza_to_basketFragment, customAdapter.bandl)

        }
//        customAdapter.itemListener={
//
//        }
//        customAdapter.itemremoveListener={
//            customAdapter.removeElement(customAdapter.data[])
//        }

//            {
//                Navigation.findNavController(view)
//                    .navigate(R.id.action_fragmentPizza_to_secondFragmentPicca)
//
//
//            }
    }

}












