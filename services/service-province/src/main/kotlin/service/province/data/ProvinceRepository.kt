package service.province.data

import service.province.model.dto.ProvinceDto

interface ProvinceRepository {
    suspend fun findAll(): List<ProvinceDto>
    suspend fun findBy(provinceId: String): ProvinceDto?
}
