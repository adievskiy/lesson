fun main() {
    val test = mapOf(1 to "Анна", 2 to "Борис", 3 to "Георгий")
    println(test.filter { it.key < 3 })
    println(test.filter { it.value.endsWith("а") })
}