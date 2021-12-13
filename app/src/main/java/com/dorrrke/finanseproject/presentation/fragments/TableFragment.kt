package com.dorrrke.finanseproject.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.presentation.viewmodels.EditViewModel
import com.dorrrke.finanseproject.presentation.viewmodels.TableViewModel


class TableFragment : Fragment() {
     private lateinit var vm4: TableViewModel

     override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?
     ): View? {
         return inflater.inflate(R.layout.fragment_table, container, false)
     }

     companion object{
         @JvmStatic
         fun newInstance()=TableFragment()
     }

 }

