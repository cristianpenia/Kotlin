fun main() {

    // Properties
    var n1: Double
    var n2: Double
    var res: Double

    while (true) {

        try {
            println("Agrega el primer valor")

            n1 = readln().toDouble()

            println("Agrega el segundo valor")

            n2 = readln().toDouble()
            res = n1 + n2

            println("la suma de tus dos valores es $res \n" +
                    "\n")
        } catch (e: NumberFormatException) {

            println("Escribe un numero valido \nError: $e\n\n")
        }
    }
}