package topics

fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> print("$e ") }
    println()

    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sum, e -> sum + e })  // sum - ���������� ����������� (���������� = 0)

    val b = a.sortedByDescending { it }  // it --> ������ ��������� �� ����� ���������
    println(b)

    a.any { it > 10 }  // false �� ���� �� ��������� �� ������ 10
    a.all { it < 10 }  // true  ��� �������� ������ 10

    val numbers = listOf(1, 3, -1, 14, -24)
    val (positives, negatives) = numbers.partition { it > 0 }  // ����� �� ��� ����� �� ������-�� �������
    println("POSITIVES = $positives")
    println("NEGATIVES = $negatives")

    val words = listOf("a", "b", "ba", "ccc", "ad")
    val result = words.groupBy { it.length }  // ���������� ��� ������ �� �����
    println(result)                           // ��������� --> HashMap (���� - ����� �����, �������� - ������ �� �����)


}