package com.dorrrke.finanseproject.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.data.adapters.MainPageRecyclerAdapter
import com.dorrrke.finanseproject.data.dbModels.PlanModel
import kotlinx.android.synthetic.main.fragment_main_page.view.*

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class MainPageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_main_page, container, false)
        view.recycler.layoutManager = LinearLayoutManager(inflater.context)
        view.recycler.adapter = MainPageRecyclerAdapter(testList())
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun testList(): List<PlanModel> {
        val data = mutableListOf<PlanModel>()
        data.add(PlanModel(1,1,"10.06.21-10.07.21", 20000.0,false,1))
        data.add(PlanModel(2,1,"10.07.21-10.08.21", 35000.0,false,2))
        data.add(PlanModel(3,1,"10.08.21-10.09.21", 15000.0,false,3))
        data.add(PlanModel(4,1,"10.09.21-10.10.21", 43500.0,false,4))
        data.add(PlanModel(5,1,"10.10.21-10.11.21", 20607.0,false,5))
        data.add(PlanModel(6,1,"10.11.21-10.12.21", 29480.0,false,6))
        return data
    }


}