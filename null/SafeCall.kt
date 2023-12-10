fun main() {
    val strAlpha: String? = "John"
    println(strAlpha?.length)       // Safe call operator ?

    val strBeta: String? = null 
    println(strBeta?.length)        // Safe call operator ?

    val strGamma: String? = null
    println(strGamma?.length ?: -1) // Elvis operator ?:

    val strDelta: String? = null    // Non-null assertion operator !!
    println(strDelta!!.length)
}
