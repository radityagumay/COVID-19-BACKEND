package main.kotlin.module.setup.koin

import controllers.ProvinceController
import org.koin.core.module.Module
import org.koin.dsl.module
import province.ProvinceRepository
import province.ProvinceService
import province.ProvinceServiceImpl
import repository.ProvinceRepositoryImpl

val provinceKoinModule: Module
    get() = module {
        // Controllers
        single { ProvinceController(get()) }

        // Services
        single<ProvinceService> { ProvinceServiceImpl(get()) }

        // Repositories
        single<ProvinceRepository> { ProvinceRepositoryImpl() }
    }