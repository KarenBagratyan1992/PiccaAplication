package com.example.myapplication

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.namespace.R

// object
//    const val KEY_BUNDLE = "KEY"
//    const val VALU_BUNDLE = "privet"



class BasketFragment : Fragment() {
 var bamdl = Bundle()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_basket, container, false)




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv :TextView = view.findViewById(R.id.baskettv)
        tv.text=bamdl.getString(PiccaAdapter.KEY_FOR_BUNDLE).toString()


    }

}