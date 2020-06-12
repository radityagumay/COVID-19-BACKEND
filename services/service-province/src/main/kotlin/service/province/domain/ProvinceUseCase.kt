package service.province.domain

import service.province.model.dto.ProvinceDto

interface ProvinceUseCase {
    suspend fun findBy(provinceId: String): ProvinceDto
    suspend fun findAll(): List<ProvinceDto>
}

