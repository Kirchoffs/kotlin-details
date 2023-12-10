fun main() {
    println(5 in 1 .. 5)  // closed-ended range
    println(5 in 1 ..< 5) // open-ended range

    for (i in 1 .. 5) {
        print("$i ")
    }
    println()

    for (i in 1 ..< 5) {
        print("$i ")
    }
    println()

    for (i in 1 .. 10 step 2) {
        print("$i ")
    }
    println()
}