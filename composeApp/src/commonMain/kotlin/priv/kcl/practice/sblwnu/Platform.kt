package priv.kcl.practice.sblwnu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform