package com.dorrrke.finanseproject.presentation.fragments

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.data.adapters.MainPageRecyclerAdapter
import com.dorrrke.finanseproject.data.db.AppDatabase
import com.dorrrke.finanseproject.data.dbModels.PlanModel
import com.dorrrke.finanseproject.presentation.viewmodels.EditViewModel
import com.dorrrke.finanseproject.presentation.viewmodels.MainViewModel
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.MaybeEmitter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class MainFragment : Fragment() {

    private lateinit var vm: MainViewModel
    lateinit var db: AppDatabase
    var list = ArrayList<PlanModel>()
    val compositeDisposable = CompositeDisposable()


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_main, container, false)
        }
        companion object{
            @JvmStatic
            fun newInstance()=MainFragment()
        }

    }


   // @SuppressLint("CheckResult")
   // override fun onCreateView(
     //   inflater: LayoutInflater, container: ViewGroup?,
      //  savedInstanceState: Bundle?
   // ): View? {
     //   vm = ViewModelProvider(this).get(MainViewModel::class.java)

      //  db = AppDatabase.getAppDatabase(inflater.context)!!

      //  return inflater.inflate(R.layout.fragment_main, container, false)
   // }
   // companion object{
      //  @JvmStatic
      //  fun newInstance()= MainFragment()
   // }
    //@SuppressLint("CheckResult")
   // override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
     //   super.onViewCreated(view, savedInstanceState)

      //  db = Room.databaseBuilder(
         //   layoutInflater.context,
         //   AppDatabase::class.java, "RRRRR"
       // ).build()

      // loadDb().subscribeOn(Schedulers.newThread())
         //  .observeOn(AndroidSchedulers.mainThread())
         //   .subscribe { Log.e(TAG, "loading data") }



      // compositeDisposable.add(db.plans().getAll()
         //   .subscribeOn(Schedulers.io())
          //  .observeOn(AndroidSchedulers.mainThread())
        // .subscribe {
           //     list.addAll(it)
          //  })

       // list.add(PlanModel(1, "10.06.21-10.07.21", 20000.0, false))
        //list.add(PlanModel(2, "10.07.21-10.08.21", 35000.0, false))
        //list.add(PlanModel(3, "10.08.21-10.09.21", 15000.0, false))

       // val recycler: RecyclerView = view.findViewById(R.id.recycler)
       // recycler.layoutManager = LinearLayoutManager(context)
       // recycler.adapter = MainPageRecyclerAdapter(list)

   // }

    //@SuppressLint("CheckResult")
    //private fun loadDb(): Completable {
       // val data = mutableListOf<PlanModel>()
        //val planDao = db.plans()
       //planDao.update(PlanModel(1, "10.06.21-10.07.21", 20000.0, false))
       //planDao.update(PlanModel(2, "10.07.21-10.08.21", 35000.0, false))
       //planDao.update(PlanModel(3, "10.08.21-10.09.21", 15000.0, false))
       //planDao.update(PlanModel(4, "10.09.21-10.10.21", 43500.0, false))
       //planDao.update(PlanModel(5, "10.10.21-10.11.21", 20607.0, false))
        //return planDao.update(PlanModel(6, "10.11.21-10.12.21", 29480.0, false))
  //  }


