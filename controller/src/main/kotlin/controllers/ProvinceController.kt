package controllers

import province.ProvinceDto
import province.ProvinceService

class ProvinceController(
    private val service: ProvinceService
) {
    suspend fun findBy(provinceId: String): ProvinceResponse {
        return service.findBy(provinceId).let(::ProvinceResponse)
    }

    suspend fun findAll(): List<ProvinceResponse> {
        return service.findAll().map(::ProvinceResponse)
    }
}

data class ProvinceResponse(
    val id: String,
    val name: String
) {
    constructor(dto: ProvinceDto) : this(
        dto.id, dto.name
    )
}
