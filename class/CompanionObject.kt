class Cat(val name: String) {
    companion object {
        val secret = 42

        fun create(name: String): Cat {
            return Cat(name)
        }

        fun property() {
            println("Cats are cute")
        }
    }

    fun meow() {
        println("$name is meowing")
    }
}

fun main() {
    Cat.property()
    println(Cat.secret)

    val cat = Cat.create("Kitty")
    cat.meow()
    Cat.property()
}
