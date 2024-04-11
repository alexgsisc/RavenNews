package com.raven.home.data

import android.util.Log
import com.raven.home.data.remote.service.HomeService
import com.raven.home.domain.HomeDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val homeService: HomeService
) : HomeDataSource {
    val TAG = HomeRepository::class.java.simpleName
    override suspend fun getNews(): Flow<List<String>> {
        return flow {
            val result =homeService.getNews()
            Log.e(TAG, "getNews: result ${result.body()}", )
            emit(listOf("Hello", "World"))
        }
    }
}
