package com.dorrrke.finanseproject.data.models

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(
    tableName = "plan", foreignKeys = arrayOf(
        ForeignKey(
            entity = UserModel::class,
            parentColumns = arrayOf("uid"),
            childColumns = arrayOf("owner_id"),
            onDelete = CASCADE
        ),
        ForeignKey(
            entity = PlanTableModel::class,
            parentColumns = arrayOf("ptId"),
            childColumns = arrayOf("plan_table_id"),
            onDelete = CASCADE
        )
    )
)
data class PlanModel(
    @PrimaryKey(autoGenerate = true) val pid: Int,
    @ColumnInfo(name = "plan_owner") val ownerName: String,
    @ColumnInfo(name = "period") val period: Double,
    @ColumnInfo(name = "budget") val budget: Double,
    @ColumnInfo(name = "moneybox") val moneybox: Boolean,
    @ColumnInfo(name = "owner_id") val ownerId: Int,
    @ColumnInfo(name = "plan_table_id") val planTableId: Int
) {
}