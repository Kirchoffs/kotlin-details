class Person(
    val name: String,
    var age: Int
) {
    init {
        println("We have a person named $name aged $age")
    }

    constructor(name: String) : this(name, -1) {
        println("Calling secondary constructor constructor(name: String)")
    }

    constructor() : this("Anonymous") {
        println("Calling secondary constructor constructor()")
    }

    fun walk() {
        println("Person is walking")
    }
}

fun main() {
    val personAlpha = Person("John", 32)
    personAlpha.walk()
    println("Name: ${personAlpha.name}, Age: ${personAlpha.age}")
    println()

    val personBeta = Person("John")
    println("Name: ${personBeta.name}, Age: ${personBeta.age}")
    println()

    val personGamma = Person()
    println("Name: ${personGamma.name}, Age: ${personGamma.age}")
}
