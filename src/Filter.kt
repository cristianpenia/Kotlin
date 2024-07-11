fun main() {
    // Filter

    val nombres = listOf("Veronica", "Maria", "Marlen", "Rufus")
    val nombresRes = nombres.filter { it.contains("e", ignoreCase = true) }

    println(nombresRes)

    val personas = listOf(
        Persona(nombre = "Veronica", edad = 67),
        Persona(nombre = "Maria", edad = 37),
        Persona(nombre = "Marlen", edad = 47),
        Persona(nombre = "Rufus", edad = 57)
    )

    val mayores = personas.filter { it.edad > 30 }.map { it.nombre }.sorted()

    println(mayores)
}

data class Persona(val nombre: String, val edad: Int)