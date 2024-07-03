fun main() {

    try {
        println("Agrega el primer valor")

        val n1 = readln().toInt()

        println("Agrega el segundo valor")

        val n2 = readln().toInt()
        val res = n1 + n2

        println("la suma de tus dos valores es $res")
    } catch (e: NumberFormatException) {

        println("Escribe un numero valido \nError: $e")
    }
}