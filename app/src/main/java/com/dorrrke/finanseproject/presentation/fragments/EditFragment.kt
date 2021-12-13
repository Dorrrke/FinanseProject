package com.dorrrke.finanseproject.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.presentation.viewmodels.EditViewModel
import com.dorrrke.finanseproject.presentation.viewmodels.MainViewModel


class EditFragment : Fragment() {
    private lateinit var vm2: EditViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = EditFragment()
    }
}