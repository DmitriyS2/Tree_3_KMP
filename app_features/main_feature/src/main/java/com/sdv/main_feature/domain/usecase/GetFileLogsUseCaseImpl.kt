package com.sdv.main_feature.domain.usecase

import com.sdv.common.log.file.FileLogs
import org.koin.core.annotation.Single
import java.io.File
import javax.inject.Inject

@Single([GetFileLogsUseCase::class])
internal class GetFileLogsUseCaseImpl (
    private val fileLogs: FileLogs,
) : GetFileLogsUseCase {

    override suspend fun invoke(): File {
        return fileLogs.sendLogs()
    }
}