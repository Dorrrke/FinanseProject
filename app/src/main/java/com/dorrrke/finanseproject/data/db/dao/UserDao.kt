package com.dorrrke.finanseproject.data.db.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dorrrke.finanseproject.data.models.UserModel

interface UserDao {
    @Query("SELECT * FROM users")
    fun getAll(): List<UserModel>

    @Query("SELECT * FROM users WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<UserModel>

    @Query(
        "SELECT * FROM user WHERE first_name LIKE :first AND " +
                "last_name LIKE :last LIMIT 1"
    )
    fun findByName(first: String, last: String): UserModel

    @Update
    fun update(user: UserModel)

    @Insert
    fun insertAll(vararg userModels: UserModel)

    @Delete
    fun delete(userModel: UserModel)
}