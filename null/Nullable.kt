import kotlin.random.Random

data class Movie(var id: Int?, var name: String)

fun saveMovieMutable(movie: Movie) {
    movie.id = Random.nextInt(42)
}

fun saveMovieImmutable(movie: Movie): Movie {
    return movie.copy(id = Random.nextInt(42))
}

fun main() {
    val name = "John"
    println(name)

    var nameNullable: String? = null
    nameNullable = "Steve"
    println(nameNullable)

    val movieMutable = Movie(null, "Avengers")
    saveMovieMutable(movieMutable)
    println(movieMutable)

    val movieImmutable = Movie(null, "Avengers")
    val movieImmutableSaved = saveMovieImmutable(movieImmutable)
    println(movieImmutableSaved)
}
