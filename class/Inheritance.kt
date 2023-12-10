open class User(val name: String) {
    open fun walk() {
        println("$name is walking")
    }
}

class Student(name: String): User(name)

class Instructor(name: String): User(name) {
    override fun walk() {
        println("$name is walking slowly")
    }
}

fun main() {
    val student = Student("John")
    student.walk()

    val instructor = Instructor("Jane")
    instructor.walk()
}
