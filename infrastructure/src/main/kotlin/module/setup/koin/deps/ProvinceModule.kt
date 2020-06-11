package main.kotlin.module.setup.koin.deps

import org.koin.core.module.Module
import org.koin.dsl.module
import service.province.controller.ProvinceController
import service.province.data.ProvinceRepositoryImpl
import service.province.domain.ProvinceRepository
import service.province.domain.ProvinceService
import service.province.domain.ProvinceServiceImpl

val provinceKoinModule: Module
    get() = module {
        // Controllers
        single { ProvinceController(get()) }

        // Services
        single<ProvinceService> { ProvinceServiceImpl(get()) }

        // Repositories
        single<ProvinceRepository> { ProvinceRepositoryImpl() }
    }