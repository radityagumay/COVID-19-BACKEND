package com.radityalabs.appInitalizer

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson

class JacksonInitializer : AppInitializers {
    override fun Application.install() {
        install(ContentNegotiation) {
            jackson {
                enable(SerializationFeature.INDENT_OUTPUT) // Pretty Prints the JSON
            }
        }
    }
}