package com.sdv.main_feature.domain.usecase

import com.sdv.common.log.util.TAG
import com.sdv.common.log.util.logDebug
import com.sdv.datastore.DataStorage
import org.koin.core.annotation.Single
import javax.inject.Inject

@Single([GoToChildrenUseCase::class])
internal class GoToChildrenUseCaseImpl (
    private val dataStorage: DataStorage,
) : GoToChildrenUseCase {

    override suspend fun invoke(newParentId: Long) {
        dataStorage.setCurrentParent(newParentId)
        "went to children for node id=$newParentId".logDebug(TAG)
    }
}