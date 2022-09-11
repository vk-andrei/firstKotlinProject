package topics

fun main() {
    var a: String = "Hello"
    // a = null // NPE (null pointer exception) исключен! а не может равняться NULL
    println(a.length)

    var b: String? = "Test"
    b = null // может быть null
    // b.length  так нельзя, потому что вдруг b ---> NULL
    b?.length  // saveCall (А так можно!)  (Никаких NPE!)

    // bob?.department?.head?.name --> если хоть одно NULL то вернется NULL (Никаких NPE!)

    // Elvis оператор -    ?:
    val l = b?.length ?: -1  // Если b не null, то вернет длину b, иначе вернет -1

    // !! --> выбрасывает NPE в случае если в переменной NULL
    b = if ((0..10).random() > 5) "More then 5" else null // тут СТРОКА или NULL
    val t = b!!.length


}