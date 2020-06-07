package com.radityalabs.module

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson

@kotlin.jvm.JvmOverloads
fun Application.installModule(testing: Boolean = false) {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT) // Pretty Prints the JSON
        }
    }
}