import java.time.LocalDate

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name: $name, Email: $email, DOB: $dob")
}

fun main() {
    printPersonDetails(name = "John", email = "john@gmail.com", dob = LocalDate.of(1990, 1, 1))
}
