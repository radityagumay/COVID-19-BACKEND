package main.kotlin.module.setup.koin.deps

import org.koin.core.module.Module
import org.koin.dsl.module
import service.province.controller.ProvinceController
import service.province.data.ProvinceRepository
import service.province.data.impl.ProvinceRepositoryImpl
import service.province.domain.ProvinceUseCase
import service.province.domain.impl.ProvinceUseCaseImpl

val provinceKoinModule: Module
    get() = module {
        // Controllers
        single { ProvinceController(get()) }

        // Services
        single<ProvinceUseCase> { ProvinceUseCaseImpl(get()) }

        // Repositories
        single<ProvinceRepository> { ProvinceRepositoryImpl() }
    }
