package com.codewithngoc.instagallery.di

import io.ktor.server.application.Application
import io.ktor.server.application.install
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
        modules(listOf(reposModule, servicesModule))
        properties(
            mapOf("application" to this@configureKoin)
        )
    }
}