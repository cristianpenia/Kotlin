fun main() {
    val num = listOf(1, 2, 3, 4, 5)
    val numRes = num.reduce { valorAcumulado, valorActual -> valorAcumulado * valorActual }

    println(numRes)

    val palabras = listOf("hola", "mundo", "kotlin")
    val concatenar = palabras.reduce { acumulado, actual -> acumulado + " " + actual }

    println(concatenar)
}