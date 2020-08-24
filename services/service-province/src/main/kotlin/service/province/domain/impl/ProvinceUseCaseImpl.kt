package service.province.domain.impl

import service.province.data.ProvinceRepository
import service.province.domain.ProvinceUseCase
import service.province.model.dto.ProvinceDto

class ProvinceUseCaseImpl(
    private val repository: ProvinceRepository
) : ProvinceUseCase {
    override suspend fun findBy(provinceId: String): ProvinceDto {
        return repository.findBy(provinceId) ?: throw IllegalAccessException(
            "No Province Found for Given Id: $provinceId"
        )
    }

    override suspend fun findAll(): List<ProvinceDto> {
        return repository.findAll()
    }
}
