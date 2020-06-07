package com.radityalabs.appInitalizer

import io.ktor.application.Application

interface AppInitializers {
    fun Application.install()
}