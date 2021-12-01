package com.dorrrke.finanseproject.data.dbModels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "planTable")
data class PlanTableModel(
    @PrimaryKey(autoGenerate = true) val ptId: Int,
    @ColumnInfo(name = "purchase") val purchase: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "price") val price: Double,
) {
}