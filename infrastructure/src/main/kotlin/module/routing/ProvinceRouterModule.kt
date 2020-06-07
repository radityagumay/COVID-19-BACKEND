package main.kotlin.module.routing

import controllers.ProvinceController
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.log
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import org.koin.ktor.ext.inject

@KtorExperimentalLocationsAPI
fun Application.provinceRouterModule() {
    val app = this
    routing {
        root(app)
    }
}

@KtorExperimentalLocationsAPI
private fun Routing.root(app: Application) {
    val controller: ProvinceController by inject()

    route("/province") {
        get<ProvinceParam> { param ->
            call.respond(controller.findBy(param.id))
        }

        get {
            app.log.debug("TAG : find all")
            call.respond(controller.findAll())
        }
    }
}

@KtorExperimentalLocationsAPI
@Location("/{id}")
data class ProvinceParam(val id: String)