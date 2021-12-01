package com.dorrrke.finanseproject.data.db.dao

import androidx.room.*
import com.dorrrke.finanseproject.data.dbModels.PlanTableModel

@Dao
interface PlanTableDao {
    @Query("SELECT * FROM planTable")
    fun getAll(): List<PlanTableModel>

    @Query("SELECT * FROM planTable WHERE ptId IN (:planTableIds)")
    fun loadAllByIds(planTableIds: IntArray): List<PlanTableModel>

//    @Query(
//        "SELECT * FROM plan_table WHERE first_name LIKE :first AND " +
//                "last_name LIKE :last LIMIT 1"
//    )
//    fun findByName(first: String, last: String): PlanTableModel

    @Update
    fun update(user: PlanTableModel)

    @Insert
    fun insertAll(vararg userModels: PlanTableModel)

    @Delete
    fun delete(userModel: PlanTableModel)
}