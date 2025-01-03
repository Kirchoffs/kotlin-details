class MyClass {
    fun greet() {
        println("Hello from MyClass!")
    }
}

// Define a function that takes a lambda with MyClass as the receiver
fun myFunction(block: MyClass.() -> Unit) {
    val instance = MyClass()
    instance.block() // Call the lambda with MyClass instance as the receiver
}

fun main() {
    // Call myFunction with a lambda
    myFunction {
        greet() // Inside the lambda, 'this' refers to the MyClass instance
    }
}
