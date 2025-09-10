package org.artemissoftware.athenalink

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform