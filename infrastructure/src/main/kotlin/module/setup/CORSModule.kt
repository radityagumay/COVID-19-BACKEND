package main.kotlin.module.setup

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.http.HttpMethod

@JvmOverloads
fun Application.corsModule() {
    install(CORS) {
        method(HttpMethod.Options)
        method(HttpMethod.Put)
        method(HttpMethod.Delete)
        anyHost()
    }
}