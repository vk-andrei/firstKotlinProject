package topics

fun main() {
    val p1 = Person("Vova", "Putin", 70)
    val child1 = Person("Hren", "Putin", 1)
    val p2 = Person("Dima", "Medvedev", 70, child1)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")
    val rectangle2 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    println(rectangle1 == rectangle2) // true -> потому что добавили слово data перед классом (появился метод equals)

}

// PRIMARY CONSTRUCTOR - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf();  // ArrayList

    init {  // init блок вып-ся после КОНСТРУКТОРА
        println("Person is created $firstName")
    }

    // SECONDARY CONSTRUCTOR - обязан в себе вызывать PRIMARY CONSTRUCTOR
    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    // Конструктор без аргументов
    constructor() : this("", "", -1)
}

// при добавлении слова data перед классом у нас АВОТОМ-КИ добавляются методы hash, toString, equals и проч.
data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1      // field тоже самое что и this в JAVA
        set(value) {
            if (value < 0) println("Negative value $value")
            field = value // назначаем полю test значение value
        }

    fun area() = height * length  // метод этого класса
}