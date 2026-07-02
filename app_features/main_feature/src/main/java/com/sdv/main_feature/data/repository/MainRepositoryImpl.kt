package com.sdv.main_feature.data.repository

import com.sdv.main_feature.data.mapper.toListUI
import com.sdv.main_feature.data.mapper.toModel
import com.sdv.main_feature.data.mapper.toUI
import com.sdv.main_feature.domain.model.NodeUI
import com.sdv.tree3.shared.com.sdv.tree3.data.DatabaseApi
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapLatest
import org.koin.core.annotation.Single
import javax.inject.Inject

@Single ([MainRepository::class])
internal class MainRepositoryImpl (
    private val databaseApi: DatabaseApi,
) : MainRepository {

    @OptIn(ExperimentalCoroutinesApi::class)
    override suspend fun getAllNodes(): Flow<List<NodeUI>> {
        return databaseApi.getAllNodes().mapLatest { it.toListUI() }
    }

    override suspend fun getAllChildrenByParent(idParent: Long): List<NodeUI> {
        return databaseApi.getAllChildrenByParent(idParent).toListUI()
    }

    override suspend fun getNodeById(id: Long): NodeUI? {
        return databaseApi.getNodeById(id)?.toUI()
    }

    override suspend fun insert(nodeUI: NodeUI): Long {
        return databaseApi.insert(nodeUI.toModel())
    }

    override suspend fun deleteNodeById(id: Long) {
        databaseApi.deleteNodeById(id)
    }

    override suspend fun deleteNodeByIdParent(idParent: Long) {
        databaseApi.deleteNodeByIdParent(idParent)
    }
}