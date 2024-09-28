fun decimalToBinary(n: Int): String {
    var number = n
    val binaryString = StringBuilder()

    while (number > 0) {
        val remainder = number % 2
        binaryString.insert(0, remainder) // Вставляем остаток в начало строки
        number /= 2
    }

    return binaryString.toString()
}

fun main() {
    println("Введите натуральное число:")
    val input = readLine()?.toIntOrNull()

    if (input != null && input > 0) {
        val binary = decimalToBinary(input)
        println("Двоичное представление числа $input: $binary")
    } else {
        println("Пожалуйста, введите корректное натуральное число.")
    }
}
