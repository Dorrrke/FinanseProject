package com.dorrrke.finanseproject.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.data.adapters.MainPageRecyclerAdapter
import com.dorrrke.finanseproject.data.dbModels.PlanModel
import com.dorrrke.finanseproject.presentation.fragments.MainPageFragment
import com.dorrrke.finanseproject.presentation.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.fragment_main_page.*

class MainActivity : AppCompatActivity() {

    private lateinit var vm: MainViewModel

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this).get(MainViewModel::class.java)


        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = MainPageRecyclerAdapter(testList())

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