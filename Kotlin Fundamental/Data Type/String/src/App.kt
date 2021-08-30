// main function
fun main() {
    val text  = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")
//    ambil tiap karakter pada string
    for (char in text){
        println("$char ")
    }
//    escaped string
    println("nama saya \"GUNA DERMAWAN\" \u00A9")
//    raw string
    println("""
        nama saya guna dermawawan,
        saya suka coding, tpi kadang jga lupa
        dokumentasinya :D
    """.trimIndent())
}