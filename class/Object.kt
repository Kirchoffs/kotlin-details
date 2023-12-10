object Authenticate {
    fun login(username: String, password: String) {
        println("Login with $username and $password")
    }
}

fun main() {
    Authenticate.login("john", "42")
}
