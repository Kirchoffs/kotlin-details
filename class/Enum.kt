enum class CourseCategory {
    DEVELOPMENT,
    DESIGN,
    BUSINESS,
    MARKETING,
}

data class Course (
    val id: Int,
    val title: String,
    val category: CourseCategory = CourseCategory.DEVELOPMENT,
    val price: Int,
)
