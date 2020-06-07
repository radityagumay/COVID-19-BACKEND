package controllers

import province.ProvinceDto
import province.ProvinceService

class ProvinceController(
    private val service: ProvinceService
) {
    fun findBy(provinceId: String): ProvinceResponse {
        return service.findBy(provinceId).let(::ProvinceResponse)
    }

    fun findAll(): List<ProvinceResponse> {
        return emptyList()
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
