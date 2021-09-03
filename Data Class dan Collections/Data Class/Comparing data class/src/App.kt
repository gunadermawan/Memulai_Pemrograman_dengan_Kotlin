data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy(age = 12)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser4)

}