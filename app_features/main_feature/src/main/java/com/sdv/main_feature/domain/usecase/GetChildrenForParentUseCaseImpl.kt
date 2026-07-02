package com.sdv.main_feature.domain.usecase

import com.sdv.main_feature.data.repository.MainRepository
import com.sdv.main_feature.domain.model.NodeUI
import org.koin.core.annotation.Single
import javax.inject.Inject

@Single([GetChildrenForParentByIdUseCase::class])
internal class GetChildrenForParentByIdUseCaseImpl (
    private val mainRepository: MainRepository,
) : GetChildrenForParentByIdUseCase {

    override suspend fun invoke(idParent: Long): List<NodeUI> = mainRepository.getAllChildrenByParent(idParent)
}