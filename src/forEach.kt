fun main() {
    var list = listOf(1,2,3,4,5,6)

    list.forEach {
        println(it)
    }

    list.forEachIndexed { index, i -> println("Posicion $index del valor $i") }
}