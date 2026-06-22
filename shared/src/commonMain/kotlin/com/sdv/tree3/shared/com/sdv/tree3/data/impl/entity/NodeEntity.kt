package com.sdv.tree3.shared.com.sdv.tree3.data.impl.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal data class NodeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String = "",
    val idParent: Long,
    val parents: String = "0",
    val children: String = "0",
)
