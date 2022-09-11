package topics

fun main() {
    var a: String = "Hello"
    // a = null // NPE (null pointer exception) ��������! � �� ����� ��������� NULL
    println(a.length)

    var b: String? = "Test"
    b = null // ����� ���� null
    // b.length  ��� ������, ������ ��� ����� b ---> NULL
    b?.length  // saveCall (� ��� �����!)  (������� NPE!)

    // bob?.department?.head?.name --> ���� ���� ���� NULL �� �������� NULL (������� NPE!)

    // Elvis �������� -    ?:
    val l = b?.length ?: -1  // ���� b �� null, �� ������ ����� b, ����� ������ -1

    // !! --> ����������� NPE � ������ ���� � ���������� NULL
    b = if ((0..10).random() > 5) "More then 5" else null // ��� ������ ��� NULL
    val t = b!!.length


}