package topics

fun main() {
    println(testSimpleFunction1())
    println(testSimpleFunction2())
    println(testSimpleFunction3(5, 5))
    println(testSimpleFunction4(5, 5))
    println("----------------------------------")

    println(testString(5))
    println("----------------------------------")
    println(testNamedArguments(3, 4, 1))
    println(testNamedArguments(y = 4, x = 3, z = 1))
    println("----------------------------------")

    testDefaultArguments()
    testDefaultArguments(y = 7)
    testDefaultArguments(4, 2)
    println("----------------------------------")

    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    println()
    //printEven(intArrayOf(1,2,3,4,5,6))  ТАК НЕЛЬЗЯ, функция ждет vararg
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6), 10, 20)   // А ТАК МОЖНО!!!


}

fun testSimpleFunction1(): Int {
    return 5 + 5
}

fun testSimpleFunction2(): Int = 5 + 5

fun testSimpleFunction3(x: Int, y: Int): Int = x + y

fun testSimpleFunction4(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// В котлине НЕ НУЖНА ПЕРЕГРУЗКА МЕТОДОВ т.к. там есть ФРГУМЕНТЫ ПО УМОЛЧАНИЮ
fun testDefaultArguments(x: Int = 1, y: Int = 3) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    if (toUpperCase)
        name.toUpperCase()
    return ("$name $number")
}

// Vararg (передаем в функцию любое кол-во аргументов)
fun printEven(vararg numbers: Int) {  // можно сюда передать любое кол-во аргументов
    numbers.forEach { n -> if (n % 2 == 0) print("$n ") }
}


