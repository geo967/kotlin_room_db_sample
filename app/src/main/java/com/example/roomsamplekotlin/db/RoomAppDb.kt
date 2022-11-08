package com.example.roomsamplekotlin.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class],version = 2)
abstract class RoomAppDb: RoomDatabase() {
    abstract fun userDao():UserDao?

    companion object{
        private var INSTANCE:RoomAppDb?=null

        fun getAppDatabase(context: Context):RoomAppDb?{
            if (INSTANCE==null){
                INSTANCE= Room.databaseBuilder<RoomAppDb>(
                    context.applicationContext,RoomAppDb::class.java,"AppDB"
                ).allowMainThreadQueries()
                    .build()
            }
            return INSTANCE
        }
    }

}