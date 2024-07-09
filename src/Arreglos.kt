fun main() {
    var array = arrayOf("Luis", "Mario", 3, 4.7, false, "Hola")

    println(array.contentToString())

    var numeros = intArrayOf(1, 2, 3, 4, 5)

    println(numeros.contentToString())
    println(numeros[2])
    println(array[1])

    array[1] = "Mario Peña"

    println(array[1])

    val nums = doubleArrayOf(2.4, 1.1, 6.2, 7.3, 3.8)

    nums.sort()

    println(nums.contentToString())
    println("El tamaño del elemento es: ${nums.size}")

    array += "Citlalli"

    println(array.contentToString())

    val newNumbers = intArrayOf(1,6,3,9,2,1,6,6,3,5,8,7,8)
    val duplicates = newNumbers.groupBy { it }.filter { it.value.size > 1 }.keys

    println("los numeros duplicados son: $duplicates")

}