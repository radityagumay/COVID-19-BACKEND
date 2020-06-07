package province

interface ProvinceRepository {
    fun fetch(): List<ProvinceDto>
    fun findBy(provinceId: String): ProvinceDto?
}
