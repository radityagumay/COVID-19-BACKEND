package service.province.domain

interface ProvinceRepository {
    suspend fun findAll(): List<ProvinceDto>
    suspend fun findBy(provinceId: String): ProvinceDto?
}
