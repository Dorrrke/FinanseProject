package com.dorrrke.finanseproject.data.db.dao

import androidx.room.*
import com.dorrrke.finanseproject.data.dbModels.PlanModel

@Dao
interface PlanDao {

    @Query("SELECT * FROM plans")
    fun getAll(): List<PlanModel>

    @Query("SELECT * FROM plans WHERE pid IN (:planIds)")
    fun loadAllByIds(planIds: IntArray): List<PlanModel>

    @Query(
        "SELECT * FROM plans WHERE owner_id LIKE (:oId)"
    )
    fun findByName(oId: Int): PlanModel

    @Update
    fun update(user: PlanModel)

    @Insert
    fun insertAll(vararg userModels: PlanModel)

    @Delete
    fun delete(userModel: PlanModel)
}