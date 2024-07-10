fun main() {

    // Funciones
    suma(v1 = 5, v2 = 8)

    // Funciones lambda
    val sum = { x: Int, y: Int -> x + y }
    val  result = sum(12, 24)
    println(result)


    val div = divicion(v1 = 38.0, v2 = 8.0)
    println(div)
}

fun suma(v1: Int, v2: Int) {
    val res = v1 + v2
    println(res)
}

// funciones con retorno
fun divicion(v1: Double, v2: Double): Double {
    return v1 / v2
}