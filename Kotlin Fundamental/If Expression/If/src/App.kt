// main function
fun main() {
   var buku = 10
    val money = 20
    var store: String
    if (money < buku){
        store =  "gacukup mas"
    } else{
       store = "balik sek mas"
    }
    println(store)
    val open = 8
    val now = 7
    val office = if (now > 7){
        "toko buka"
    }else if (now == open){
        "tunggu sebentar ya"
    } else {
        "toko sedang tutup"
    }
    println(office)
}