package com.example.roomsamplekotlin.db

import androidx.room.*

@Dao
interface UserDao {

    @Query(value = "SELECT * FROM userInfo ORDER BY id DESC")
    fun getAllUserInfo():List<UserEntity>?

    @Insert
    fun insertUser(user:UserEntity)

    @Delete
    fun deleteUser(user:UserEntity)

    @Update
    fun updateUser(user:UserEntity)
}