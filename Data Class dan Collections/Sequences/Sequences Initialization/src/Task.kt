fun main() {
    val list = (1..1000_000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }
}