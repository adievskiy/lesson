fun main() {
    val test = mapOf(1 to "Анна", 2 to "Борис", 3 to "Георгий")
    println(test.filter { it.key < 3 })
    println(test.filter { it.value.endsWith("а") })
    println(test.filter { it.value.startsWith("Г") })

    val prizeMap = mapOf(1 to 20, 2 to 10, 3 to 50, 4 to 76, 5 to 25)
    println(prizeMap.filter { it.key == 5 && it.value > 20 })
}