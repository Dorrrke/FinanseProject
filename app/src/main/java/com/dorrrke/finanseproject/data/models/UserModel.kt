package com.dorrrke.finanseproject.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserModel(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "first_name") val first_name: String?,
    @ColumnInfo(name = "last_name") val last_name: String?,
    @ColumnInfo(name = "middle_name") val middle_name: String?,
    @ColumnInfo(name = "phone") val phone: String?,
    @ColumnInfo(name = "email_address") val email_address: String?,
){
}