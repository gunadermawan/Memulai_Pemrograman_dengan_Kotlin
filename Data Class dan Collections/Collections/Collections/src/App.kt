class User

fun main() {
//    list secara otomatis bisa mengenali tipe data yang ada didalamnya dengan menggunakan
//    listOf<Any>
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    val anyList = listOf('a', "Kotlin", 3, true, User())

    println(anyList[3])
}