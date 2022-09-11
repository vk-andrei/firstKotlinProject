package topics

fun main() {
    val p1 = Person("Vova", "Putin", 70)
    val child1 = Person("Hren", "Putin", 1)
    val p2 = Person("Dima", "Medvedev", 70, child1)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")
    val rectangle2 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    println(rectangle1 == rectangle2) // true -> ������ ��� �������� ����� data ����� ������� (�������� ����� equals)

}

// PRIMARY CONSTRUCTOR - ��������� �����������
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf();  // ArrayList

    init {  // init ���� ���-�� ����� ������������
        println("Person is created $firstName")
    }

    // SECONDARY CONSTRUCTOR - ������ � ���� �������� PRIMARY CONSTRUCTOR
    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    // ����������� ��� ����������
    constructor() : this("", "", -1)
}

// ��� ���������� ����� data ����� ������� � ��� ������-�� ����������� ������ hash, toString, equals � ����.
data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1      // field ���� ����� ��� � this � JAVA
        set(value) {
            if (value < 0) println("Negative value $value")
            field = value // ��������� ���� test �������� value
        }

    fun area() = height * length  // ����� ����� ������
}