package com.dorrrke.finanseproject.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dorrrke.finanseproject.data.db.dao.PlanDao
import com.dorrrke.finanseproject.data.db.dao.PlanTableDao
import com.dorrrke.finanseproject.data.db.dao.UserDao
import com.dorrrke.finanseproject.data.dbModels.PlanModel
import com.dorrrke.finanseproject.data.dbModels.PlanTableModel
import com.dorrrke.finanseproject.data.dbModels.UserModel


@Database(entities = [UserModel::class, PlanModel::class, PlanTableModel::class],
    version = 1,
    exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun users():UserDao
    abstract fun plans():PlanDao
    abstract fun planTable():PlanTableDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getAppDatabase(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "room-kotlin-database"
                ).build()
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}