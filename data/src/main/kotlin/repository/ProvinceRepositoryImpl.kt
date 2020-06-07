package repository

import province.ProvinceDto
import province.ProvinceRepository

class ProvinceRepositoryImpl : ProvinceRepository {
    override fun fetch(): List<ProvinceDto> {
        return emptyList()
    }

    override fun findBy(provinceId: String): ProvinceDto? {
        return null
    }
}