fun checkType(type: Any) {
    when (type) {
        is String -> println("String")
        is Int -> println("Int")
        is Boolean -> println("Boolean")
        else -> println("Unknown")
    }
}

fun castType(any: Any) {
    when (any) {
        any as? String -> println("String")
        any as? Int -> println("Int")
        any as? Boolean -> println("Boolean")
        else -> println("Unknown")
    }
}

fun main() {
    val name = "Ben"
    println(name is String)

    val age = 20
    checkType(age)
    castType(age)
}
