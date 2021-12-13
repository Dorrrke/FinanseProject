package com.dorrrke.finanseproject.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
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
import com.dorrrke.finanseproject.databinding.ActivityMainBinding
import com.dorrrke.finanseproject.presentation.fragments.EditFragment
import com.dorrrke.finanseproject.presentation.fragments.FamilyFragment
import com.dorrrke.finanseproject.presentation.fragments.MainFragment
import com.dorrrke.finanseproject.presentation.fragments.TableFragment
import com.dorrrke.finanseproject.presentation.viewmodels.MainViewModel
import io.reactivex.Completable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_main_page.*

class MainActivity : AppCompatActivity() {

    lateinit var db: AppDatabase
    lateinit var binding: ActivityMainBinding


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            supportFragmentManager.beginTransaction().replace(R.id.place_holder, MainFragment())
            .commit()
        db = Room.databaseBuilder(
           applicationContext,
            AppDatabase::class.java, "poka"
        ).build()

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.nav_меню -> {
                Toast.makeText(this, "Главное меню", Toast.LENGTH_SHORT).show()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.place_holder, MainFragment())
                    .commit()
                item.isChecked = true
                true
            }
            R.id.nav_Создание -> {

                Toast.makeText(this, "Создание плана", Toast.LENGTH_SHORT).show()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.place_holder, TableFragment.newInstance())
                    .commit()
                item.isChecked = true
                return true

            }
            R.id.nav_Редактирование -> {
                Toast.makeText(this, "Редактирование плана", Toast.LENGTH_SHORT).show()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.place_holder, EditFragment.newInstance())
                    .commit()
                item.isChecked = true
                return true
            }
            R.id.nav_Семья -> {
                Toast.makeText(this, "Семейный план", Toast.LENGTH_SHORT).show()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.place_holder, FamilyFragment.newInstance())
                    .commit()
                item.isChecked = true
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
