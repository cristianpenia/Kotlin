fun main() {
    val personas = listOf(
        Persona(nombre = "Veronica", edad = 67),
        Persona(nombre = "Maria", edad = 37),
        Persona(nombre = "Marlen", edad = 47),
        Persona(nombre = "Rufus", edad = 57)
    )

    val mayores = personas.filter { it.edad > 30 }.map { it.nombre }.sorted()

    println(mayores)

    // MAP
    println("----------------- MAP -----------------")

    val listaPersonas = personas.map { it.nombre }

    println(listaPersonas)

    var multiplicar = personas.map { it.edad * 2 }

    println(multiplicar)

    val sumaEdades = personas.map { it.edad }.sum()

    println(sumaEdades)

    val palabras = listOf("hola", "mundo", "kotilin")
    val sumaPalabras = palabras.map { it.length }

    println(sumaPalabras)

}