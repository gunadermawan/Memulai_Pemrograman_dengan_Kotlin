// main function
fun main() {
    val user = setUser("Alfian", 19)
    println(user)
    printUser("Alfian")
}

// jika nilai kembaliann cuman satu baris, bisa digabungkan di expression body
// dan compiler akan menentukan sendri termasuk tipe apa dari fungsi kita
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
// pake nilai kembalian tipe UNIT jika tidak ingin fungsi mengembalikan sebuah nilai
fun printUser(name: String): Unit {
     print( "Your name is $name")
}