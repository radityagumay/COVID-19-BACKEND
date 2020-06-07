package repository

import province.ProvinceDto
import province.ProvinceRepository

class ProvinceRepositoryImpl : ProvinceRepository {
    override suspend fun findAll(): List<ProvinceDto> {
        return listOf(
            ProvinceDto(
                id = "12",
                name = "Jakarta",
                coordinate = ProvinceDto.ProvinceCoordinate(12.0, 33.0),
                positive = 1232,
                death = 12,
                mark = 3,
                recover = 12
            ),
            ProvinceDto(
                id = "122",
                name = "Bali",
                coordinate = ProvinceDto.ProvinceCoordinate(12.0, 33.0),
                positive = 1232,
                death = 12,
                mark = 3,
                recover = 12
            )
        )
    }

    override suspend fun findBy(provinceId: String): ProvinceDto? {
        return ProvinceDto(
            id = "12",
            name = "Jakarta",
            coordinate = ProvinceDto.ProvinceCoordinate(12.0, 33.0),
            positive = 1232,
            death = 12,
            mark = 3,
            recover = 12
        )
    }
}