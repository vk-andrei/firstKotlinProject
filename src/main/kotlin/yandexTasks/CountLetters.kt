package yandexTasks

fun main() {
    // AAAAABBBBCCXYZDDDDEEEFFFAAAAAAABBBBBBBBBB -> A5B4C2XYZD4E3F3A7B10

    val s = "AAAAABBBBCCXYZDDDDEEEFFFAAAAAAABBBBBBBBBB"

    println(countLetters(s))

}

fun countLetters(s: String): String {

    var currentLetter = s[0]
    var count = 1
    var result = ""

    for (letter in s.substring(1)) {

        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1) {
                result += "$currentLetter"
            } else {
                result += "$currentLetter$count"
            }
            currentLetter = letter
            count = 1
        }
    }

    if (count == 1) {
        result += "$currentLetter"
    } else {
        result += "$currentLetter$count"
    }

    return result
}
