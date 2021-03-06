package com.shafayat.helloworld.ui.features.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.shafayat.helloworld.R
import com.shafayat.helloworld.core.ui.BaseFragment
import com.google.android.material.textview.MaterialTextView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<MainViewModel>() {

    override val viewModel: MainViewModel by viewModels()

    override fun getLayoutId(): Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.message.observe(viewLifecycleOwner, {
            view.findViewById<MaterialTextView>(R.id.tvMessage).text = it
        })

        viewModel.getMessage()
    }
}