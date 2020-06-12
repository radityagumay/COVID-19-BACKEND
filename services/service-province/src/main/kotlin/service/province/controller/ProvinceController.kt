package service.province.controller

import service.province.domain.ProvinceUseCase
import service.province.model.response.ProvinceResponse

class ProvinceController(
    private val useCase: ProvinceUseCase
) {
    suspend fun findBy(provinceId: String): ProvinceResponse {
        return useCase.findBy(provinceId).let(::ProvinceResponse)
    }

    suspend fun findAll(): List<ProvinceResponse> {
        return useCase.findAll().map(::ProvinceResponse)
    }
}

