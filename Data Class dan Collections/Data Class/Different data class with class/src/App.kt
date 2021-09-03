class user (val name: String, val umur: Int)
data class dataUser(val name: String, val umur: Int)
fun main(){
    val user = user("guna dermawan", 12)
    val dataUser = dataUser("guna dermawan", 12)

    println("$user")
    println("$dataUser")
}