package topics

fun main() {

    // for each
    val fruits = listOf("banana", "apple", "orange")  // List.of JAVA (CAN'T CHANGE ELEMENTS)

    var names = mutableListOf("Mark", "Artemii")      // ArrayList
    names.add(2, "Sonya")

    for (name in names) {
        println(name)
    }
    println("----------------------------------")

    // while
    var i = 0
    while (i < fruits.size) {
        println("Item at $i is ${fruits[i]}")
        i++
    }
    println("----------------------------------")

    // Диапазоны (как в ПИТОНЕ)
    3..10 // ---> диапазон от 3 до 10 вклюительно

    println(5 in 3..10)   // true
    println("----------------------------------")

    for (j in 1..10)
        print(" $j")
    println()

    for (j in 1 until 10)
        print(" $j")
    println()

    for (j in 10 downTo 1)
        print(" $j")
    println()

    for (j in 0..100 step 10)
        print(" $j")
    println()


}