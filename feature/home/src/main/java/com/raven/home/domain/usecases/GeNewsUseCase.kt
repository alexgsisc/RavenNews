package com.raven.home.domain.usecases

import com.raven.core.bases.BaseUseCase
import com.raven.home.domain.HomeDataSource
import com.raven.home.domain.mapper.GetNewsMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GeNewsUseCase @Inject constructor(
    private val dataSource: HomeDataSource,
    private val mapper: GetNewsMapper
) : BaseUseCase<Unit, List<String>>() {

    override fun execute(params: Unit): Flow<List<String>> {
        return flow {
            val result = dataSource.getNews()
            emit(listOf("data"))
        }
    }
}
