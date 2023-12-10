class Item() {
    var name: String = ""

    var price: Int = -1
    get() {
        println("Getting price")
        return field
    }
    set(value) {
        println("Setting price")
        field = value
    }

    constructor(name: String, price: Int) : this() {
        this.name = name
        this.price = price
    }
}

fun main() {
    val item = Item("Alphabet Puzzle", 99)
    println("Name: ${item.name}, Price: ${item.price}")
    item.price = 199
}
