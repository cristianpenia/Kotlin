fun main() {
    for(i in 1..10) {
        println(i)
    }

    for(i in 'a'..'f') {
        println(i)
    }

    val users = arrayOf("Veronica", "Mari", "Marlen", "Jacqueline")
    for(user in users) {
        println(user)
    }

    for(user in users.indices) {
        println("Indice $user con valor: ${users[user]}")
    }
}