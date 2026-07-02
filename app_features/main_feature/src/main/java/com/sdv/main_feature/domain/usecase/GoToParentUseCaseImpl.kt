package com.sdv.main_feature.domain.usecase

import com.sdv.common.log.util.TAG
import com.sdv.common.log.util.logDebug
import com.sdv.datastore.DataStorage
import org.koin.core.annotation.Single
import javax.inject.Inject

@Single([GoToParentUseCase::class])
internal class GoToParentUseCaseImpl (
    private val dataStorage: DataStorage,
) : GoToParentUseCase {

    override suspend fun invoke(newParentId: Long) {
        dataStorage.setCurrentParent(newParentId)
        "went to parent id=$newParentId".logDebug(TAG)
    }
}