import kotlin.random.Random

fun printName(name: String) {
    println(name)
}

fun printNameNullable(name: String?) {
    println(name)
}

fun main() {
    val nameNullableAlpha: String? = "Tom"
    printName(nameNullableAlpha!!)
    printNameNullable(nameNullableAlpha)

    val nameNullableBeta: String? = null

    val name = if (Random.nextBoolean()) {
        nameNullableAlpha
    } else {
        nameNullableBeta
    }

    name?.run {
        printName(this)
    }
}
