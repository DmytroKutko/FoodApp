package com.life.foodapplication.repository

import com.life.foodapplication.db.LocalDataSource
import com.life.foodapplication.db.LocalDataSourceImplementation
import com.life.foodapplication.db.RemoteDataSource
import com.life.foodapplication.db.RemoteDataSourceImplementation
import javax.inject.Inject

class Repository @Inject constructor(
    val remoteDataSource: RemoteDataSourceImplementation,
    val localDataSource: LocalDataSourceImplementation
){
    val remote = remoteDataSource
    val local = localDataSource
}