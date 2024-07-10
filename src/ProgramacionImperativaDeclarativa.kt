// programacion funcional
// filter, map, reduce, sorted
fun main() {
    // programacion imperativa
    // tradicional, donse se ejecuta paso a paso
    val num = listOf(1,2,3,4,5)
    val res = sumarLista(num)
    println(res)

    val pares = listOf(2,3,8,12,16,15)
    val res2 = filtrarPares(pares)
    println(res2)

    // programacion declarativa o funcinal
    // usar funcionalidades previamente ejecutadas
    println(res)



}

fun sumarLista(lista: List<Int>): Int {

    // programacion imperativa
    var resultado = 0
    for (i in lista) {
        resultado += 1
    }

//    return resultado

    // programacion declarativa

    return  lista.sum()
}

fun filtrarPares(lista:List<Int>): List<Int> {

    // programacion imperativa
    val resultado = mutableListOf<Int>()

    for(i in lista) {
        if (i % 2 == 0) {
            resultado.add(i)
        }
    }

//    return resultado


    // programacion declarativa o funcional
    return lista.filter { it % 2 == 0 }.toList()
}