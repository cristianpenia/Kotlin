fun main() {
    var x : Int? = null

    x?.let {
        println("la variable x si tiene valor")
    }

    var y : Int? = null

    // forzar
    y.let {
        println("la variable y se forzo")
    }
}