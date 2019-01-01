package com.ronwayachal.kotlinisp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


import androidx.databinding.DataBindingUtil
import com.ronwayachal.kotlinisp.databinding.FragmentOutputBinding
import com.ronwayachal.kotlinisp.databinding.InputFragmentBinding


class InputFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val binding=DataBindingUtil.inflate<InputFragmentBinding>(inflater, R.layout.input_fragment, container, false)
        binding.homeviewmodel=ViewModelProviders.of(activity!!).get(HomeViewModel::class.java)
        binding.setLifecycleOwner(this)

        return binding.getRoot()

    }

}
