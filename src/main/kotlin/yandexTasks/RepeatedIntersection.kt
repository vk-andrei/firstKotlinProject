package yandexTasks

fun main() {
    // ���� ��� ������� [1, 2, 3, 2, 0] � [5, 1, 2, 7, 3, 2]
    // ���� ������� [1, 2, 2, 3] (������� �� �����)
    // ���������� ������� �-� ��� ��������� 2 ������� � ���������� �� �����������
    val a = intArrayOf(1, 2, 3, 2, 0)
    val b = intArrayOf(5, 1, 2, 7, 3, 2)
    println(getRepeatedIntersection(a, b))

}

fun getRepeatedIntersection(a: IntArray, b: IntArray): List<Int> {
    val c : MutableList<Int> = mutableListOf()

    for (i in a) {
        for (j in b) {
            if (i == j) {
                c.add(i)
                break
            }
        }
    }

    return c
}