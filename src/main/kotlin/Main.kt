/**
 * Ejemplo que muestra el funcionamiento del
 */
fun main() {
    whenExpresionIs()
    println("${whenDeclaracionVariable()}")
    println("${whenSinArgmentos()}")

}

fun whenExpresionIs() {
    var value: Any = 1
    when (value) {
        is Int -> println("Valor del tipo Int "+ (value + 1).toString())
        is String -> println("El texto es $value")
        is Boolean -> if (value) print("es verdadero") else print("es falso")
    }
}


fun whenDeclaracionVariable(): String {
    val playerLucky = 0.2
    val bonus = 0.3
    var text = ""
    when (val damage: Double = playerLucky + bonus) {
        in 0.0..0.3 -> text = "Daño recibido:${damage * 10}"
        in 0.3..0.6 -> text = "Daño recibido:${damage * 20}"
        in 0.6..1.0 -> text = "Daño recibido:${damage * 30}"
    }
    return text
}

fun whenSinArgmentos(): String {
    var s = "Me gusta el juego fifa"
    var x = 700
    var v = 0.0F
    val text = when {
        s.contains("fifa") -> "es un gamer!"
        x > 599 -> "es muy caro!"
        s is String -> "Es un String!"
        else -> ""
    }
    return "Resultado final $text"
}