package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("Between 10 and 20")
        is String -> println("It is string with length ${input.length}")
        else -> println("Something else")
    }
}