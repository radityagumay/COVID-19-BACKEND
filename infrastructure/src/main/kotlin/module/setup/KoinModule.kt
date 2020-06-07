package main.kotlin.module.setup

import io.ktor.application.Application
import org.koin.dsl.module.Module
import org.koin.ktor.ext.installKoin

@JvmOverloads
fun Application.koinModule() {
    installKoin(KoinModuleBuilder.modules())
}

object KoinModuleBuilder {
    fun modules(): List<Module> = emptyList()
}
