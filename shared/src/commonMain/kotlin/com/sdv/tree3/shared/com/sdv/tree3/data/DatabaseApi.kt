package com.sdv.tree3.shared.com.sdv.tree3.data

import com.sdv.tree3.shared.com.sdv.tree3.domain.model.Node
import kotlinx.coroutines.flow.Flow

interface DatabaseApi {

    suspend fun getAllNodes(): Flow<List<Node>>
    suspend fun getAllChildrenByParent(idParent: Long): List<Node>
    suspend fun getNodeById(id: Long): Node?
    suspend fun insert(node: Node): Long
    suspend fun deleteNodeById(id: Long)
    suspend fun deleteNodeByIdParent(idParent: Long)
}