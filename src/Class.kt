class Personas {
    // atributos (variables)
    var nombre =""
    var edad = 0

    // constructor secundario
    constructor(nombre:String, edad:Int)  {
        this.nombre = nombre
        this.edad = edad
    }

    // metodos (funciones)
    fun hola() {
        println("Hello world, my name is $nombre and i am $edad years")
    }
}

class Usuarios(private var name: String, private  var email: String){
    fun login() {
        println("Login con user: $name, email: $email")
    }
}


fun main() {
    val personas = Personas(nombre = "Cristian", edad = 26)

    println(personas.nombre)
    println(personas.edad)
    println(personas.hola())

    val user = Usuarios(name = "Rufus", email = "rufus_king@gmail.com")

    println(user.login())
}

