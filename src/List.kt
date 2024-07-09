fun main() {
    val numeros = listOf(1,2,3,4,5,6)

    println(numeros)
    println(numeros[0])

    println(numeros.size)

    val list = mutableListOf(1,2,3,4,5,6)
    list.add(6)
    list.remove(3)

    val array = arrayOf(1,2,3,4,5,6,7)
    val array2 = array.toMutableList()

    array2.remove(6)

}