package com.example.roomsamplekotlin.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userInfo")
data class UserEntity (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="id") val id:Int=0,
    @ColumnInfo(name="name") val name:String,
            @ColumnInfo(name="email") val email:String
)