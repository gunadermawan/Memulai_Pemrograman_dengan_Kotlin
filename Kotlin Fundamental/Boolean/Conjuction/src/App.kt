// main function
fun main() {
    val officeOpen = 7
    val officeClose = 17
    var now = 10
    var isOpen = if (now >= officeOpen && now <= officeClose){
        true
    } else {
        false
    }
// conjunction / AND
    val isOpen2 = now >= officeOpen && now <= officeClose
    println("kantor buka?")
    println("$isOpen")

    println("kantor kedua buka?")
    println("$isOpen2")
// disjunction / OR
    val isCloses = now < officeOpen || now > officeClose
    println("apakah kantor tutup?")
    println("$isCloses")

//    Negation/Not
    isOpen = now > officeOpen
    if (!isOpen){
        println("kantor tutup")
    } else{
        print("kantor buka")
    }
}