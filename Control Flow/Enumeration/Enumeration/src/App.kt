// main function
fun main() {
    val warna: Array<Color> = Color.values()
    warna.forEach { color ->
        println(color)
    }

}
enum class Color(val i: Int){
    RED(i = 0xFF0000){
//        contoh dari annonymous class
        override fun printValue(){
            println("Value of RED is $i ")
        }
    },
    GREEN(i = 0x00FF00){
        override fun printValue(){
        println("value of GREEN is $i")
        }
    },
    BLUE(i = 0x0000FF){
      override fun printValue(){
          println("value of BLUE is $i")
      }
    };
    abstract fun printValue()
}
