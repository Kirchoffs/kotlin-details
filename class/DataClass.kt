data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val courseAlpha = Course(1, "Kotlin", "John")
    println(courseAlpha)

    val courseBeta = courseAlpha.copy()
    println(courseAlpha == courseBeta)

    val courseGamma = courseAlpha.copy(
        id = 2,
        name = "Java"
    )
    println(courseGamma)
}
