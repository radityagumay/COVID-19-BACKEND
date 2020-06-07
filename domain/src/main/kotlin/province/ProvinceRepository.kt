package province

interface ProvinceRepository {
    suspend fun findAll(): List<ProvinceDto>
    suspend fun findBy(provinceId: String): ProvinceDto?
}
