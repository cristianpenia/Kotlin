fun main() {

    // cambio de tipo de dato
    val num1 = 5
    val num2 = "9"

    val res = num1 + num2.toInt()
    println(res)

    // contatenacion

    val hello = "Hola"
    val world = "mundo"

    val helloWorld = hello + " " + world

    println(helloWorld)

    println("Mi numero es el: $num2")

    val result = hello.plus(" ").plus(world).plus(" \nsalto de linea")

    val txtArray = arrayOf("Hello","world")
    val resTxtArray = txtArray.joinToString(" ")

    println(resTxtArray)