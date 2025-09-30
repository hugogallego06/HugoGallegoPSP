import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numeroAleatorio = (0..10).random()

    while (scanner.hasNextLine()) {
        val linea = scanner.nextLine()
        val numero = linea.toIntOrNull()
        if (numero == null) {
            println("Por favor, introduce un namero valido.")
            continue
        }
        if (numero == numeroAleatorio) {
            println("¡Correcto! Has adivinado el número $numeroAleatorio.")
            break
        } else {
            println("Incorrecto, intenta otra vez.")
        }
    }
}
