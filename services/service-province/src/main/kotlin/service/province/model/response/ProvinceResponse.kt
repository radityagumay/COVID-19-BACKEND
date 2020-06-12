package service.province.model.response

import service.province.model.dto.ProvinceDto

data class ProvinceResponse(
    val id: String,
    val name: String
) {
    constructor(dto: ProvinceDto) : this(
        dto.id, dto.name
    )
}
