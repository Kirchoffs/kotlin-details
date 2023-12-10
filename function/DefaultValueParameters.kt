import java.time.LocalDate

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name: $name, Email: $email, DOB: $dob")
}

fun main() {
    printPersonDetails("John", "john@gmail.com")
}
