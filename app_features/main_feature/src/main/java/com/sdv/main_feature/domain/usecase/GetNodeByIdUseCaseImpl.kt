package com.sdv.main_feature.domain.usecase

import com.sdv.main_feature.data.repository.MainRepository
import com.sdv.main_feature.domain.model.NodeUI
import org.koin.core.annotation.Single
import javax.inject.Inject

@Single([GetNodeByIdUseCase::class])
internal class GetNodeByIdUseCaseImpl (
    private val mainRepository: MainRepository,
) : GetNodeByIdUseCase {

    override suspend fun invoke(id: Long): NodeUI? = mainRepository.getNodeById(id)
}