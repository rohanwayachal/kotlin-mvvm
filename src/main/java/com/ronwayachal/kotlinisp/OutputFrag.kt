package com.ronwayachal.kotlinisp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.ronwayachal.kotlinisp.databinding.FragmentOutputBinding
import com.ronwayachal.kotlinisp.databinding.InputFragmentBinding
import kotlinx.android.synthetic.main.fragment_output.*


class OutputFrag : Fragment() {







    companion object {
        fun newInstance() = OutputFrag()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       // val v= inflater.inflate(R.layout.fragment_output, container, false)


        val binding= DataBindingUtil.inflate<FragmentOutputBinding>(inflater, R.layout.fragment_output, container, false);

        binding.homeviewmodel=ViewModelProviders.of(activity!!).get(HomeViewModel::class.java)




        // viewModel =  ViewModelProviders.of(activity!!).get(HomeViewModel::class.java)

        val v = binding.getRoot()
        binding.setLifecycleOwner(this)





        return v
    }


}
