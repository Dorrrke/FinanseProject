package com.dorrrke.finanseproject.presentation

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.data.adapters.MainPageRecyclerAdapter
import com.dorrrke.finanseproject.data.db.AppDatabase
import com.dorrrke.finanseproject.data.dbModels.PlanModel
import com.dorrrke.finanseproject.presentation.fragments.MainFragment
import com.dorrrke.finanseproject.presentation.viewmodels.MainViewModel
import io.reactivex.Completable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_main_page.*

class MainActivity : AppCompatActivity() {

    lateinit var db: AppDatabase

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentView, MainFragment())
            .commit()
//        db = Room.databaseBuilder(
//            applicationContext,
//            AppDatabase::class.java, "poka"
//        ).build()
//
//        loadDb().subscribeOn(Schedulers.newThread())
//            .subscribe()
//
//
//        testList()
//
//        val recycler: RecyclerView = findViewById(R.id.recycler)
//        recycler.layoutManager = LinearLayoutManager(this)
//        recycler.adapter = MainPageRecyclerAdapter(db.plans().getAll())

    }

//    @SuppressLint("CheckResult")
//    private fun loadDb(): Completable {
//        val data = mutableListOf<PlanModel>()
//        val planDao = db.plans()
//        planDao.update(PlanModel(1, "10.06.21-10.07.21", 20000.0, false))
//        planDao.update(PlanModel(2, "10.07.21-10.08.21", 35000.0, false))
//        planDao.update(PlanModel(3, "10.08.21-10.09.21", 15000.0, false))
//        planDao.update(PlanModel(4, "10.09.21-10.10.21", 43500.0, false))
//        planDao.update(PlanModel(5, "10.10.21-10.11.21", 20607.0, false))
//        return planDao.update(PlanModel(6, "10.11.21-10.12.21", 29480.0, false))
//    }

//    private fun testList() {
//        val data = mutableListOf<PlanModel>()
//        val planDao = db.plans()
//        planDao.insertAll(PlanModel(1, 1, "10.06.21-10.07.21", 20000.0, false, 1),
//            PlanModel(2, 1, "10.07.21-10.08.21", 35000.0, false, 2),
//            PlanModel(3, 1, "10.08.21-10.09.21", 15000.0, false, 3),
//            PlanModel(4, 1, "10.09.21-10.10.21", 43500.0, false, 4),
//            PlanModel(5, 1, "10.10.21-10.11.21", 20607.0, false, 5),
//            PlanModel(6, 1, "10.11.21-10.12.21", 29480.0, false, 6))
//}
}