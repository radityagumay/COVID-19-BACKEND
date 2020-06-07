package main.kotlin

import io.ktor.server.netty.EngineMain
import java.util.Collections

fun main(args: Array<String>): Unit = EngineMain.main(args)

data class Snippet(val text: String)

val snippets = Collections.synchronizedList(
    mutableListOf(
        Snippet("hello"),
        Snippet("world")
    )
)

data class PostSnippet(
    val snippet: Text
) {
    data class Text(val text: String)
}