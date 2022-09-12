package yandexTasks

fun main() {
    // ƒаны два массива [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2]
    // Ќадо вернуть [1, 2, 2, 3] (пор€док не важен)
    // необходимо создать ф-ю кот принимает 2 массива и возвращает их пересечение
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