package travel.planning

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform