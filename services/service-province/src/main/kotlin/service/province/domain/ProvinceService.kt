package service.province.domain

interface ProvinceService {
    suspend fun findBy(provinceId: String): ProvinceDto
    suspend fun findAll(): List<ProvinceDto>
}

class ProvinceServiceImpl(
    private val repository: ProvinceRepository
) : ProvinceService {
    override suspend fun findBy(provinceId: String): ProvinceDto {
        return repository.findBy(provinceId) ?: throw IllegalAccessException(
            "No Province Found for Given Id: $provinceId"
        )
    }

    override suspend fun findAll(): List<ProvinceDto> {
        return repository.findAll()
    }
}