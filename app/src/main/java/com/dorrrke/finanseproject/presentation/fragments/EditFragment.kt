package com.dorrrke.finanseproject.presentation.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.data.dbModels.PlanTableModel
import com.dorrrke.finanseproject.data.models.PlanTable
import com.dorrrke.finanseproject.presentation.viewmodels.EditViewModel
import com.dorrrke.finanseproject.presentation.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.fragment_edit.*
import kotlinx.android.synthetic.main.fragment_edit.view.*


class EditFragment : Fragment() {
    private lateinit var vm2: EditViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.fragment_edit, container, false)
    }

    companion object{
        @JvmStatic
        fun newInstance()=EditFragment()
    }

}