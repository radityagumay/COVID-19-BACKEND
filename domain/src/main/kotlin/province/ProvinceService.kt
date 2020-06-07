package province

interface ProvinceService {
    fun findBy(provinceId: String): ProvinceDto
}

class ProvinceServiceImpl(
    private val repository: ProvinceRepository
) : ProvinceService {
    override fun findBy(provinceId: String): ProvinceDto {
        return repository.findBy(provinceId) ?: throw IllegalAccessException(
            "No Province Found for Given Id: $provinceId"
        )
    }
}