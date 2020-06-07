package main.kotlin.module.routing

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.log
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import io.ktor.routing.routing
import main.kotlin.PostSnippet
import main.kotlin.Snippet
import main.kotlin.snippets

fun Application.snippetRouterModule() {
    routing {
        route("/snippet") {
            get {
                call.respond(mapOf("snippets" to synchronized(snippets) { snippets.toList() }))
            }
            post {
                val post = call.receive<PostSnippet>()
                log.debug("TAG : ${post.snippet.text}")
                snippets += Snippet(post.snippet.text)
                call.respond(mapOf("OK" to true))
            }
        }
    }
}