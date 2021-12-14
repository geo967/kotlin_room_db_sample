package com.example.roomsamplekotlin.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.roomsamplekotlin.db.RoomAppDb
import com.example.roomsamplekotlin.db.UserEntity

class MainActivityViewModel(app:Application):AndroidViewModel(app) {
    lateinit var allUsers:MutableLiveData<List<UserEntity>>
    init {
        allUsers= MutableLiveData()

    }
    fun getAllUsersObservers():MutableLiveData<List<UserEntity>>{
        return allUsers
    }
    private fun getAllUsers(){
       val userDao= RoomAppDb.getAppDatabase(getApplication())?.userDao()
       val list= userDao?.getAllUserInfo()
        allUsers.postValue(list)
    }
    fun insertUserInfo(entity:UserEntity){
        val userDao= RoomAppDb.getAppDatabase(getApplication())?.userDao()
        userDao?.insertUser(entity)
        getAllUsers()
    }
    fun updateUserInfo(entity:UserEntity){
        val userDao= RoomAppDb.getAppDatabase(getApplication())?.userDao()
        userDao?.updateUser(entity)
        getAllUsers()
    }
    fun deleteUserInfo(entity:UserEntity){
        val userDao= RoomAppDb.getAppDatabase(getApplication())?.userDao()
        userDao?.deleteUser(entity)
        getAllUsers()
    }
}