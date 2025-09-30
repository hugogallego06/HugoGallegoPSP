import java.io.*
import java.util.*

fun main() {
    val proceso = ProcessBuilder(
        "C:\\Users\\Hugo\\.jdks\\openjdk-22.0.2\\bin\\java.exe",
        "-classpath",
        "C:\\Users\\Hugo\\Documents\\GitHub\\HugoGallegoPSP\\EjercicioProcesos\\out\\production\\EjercicioProcesos;" +
                "C:\\Users\\Hugo\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.0.20\\kotlin-stdlib-2.0.20.jar;" +
                "C:\\Users\\Hugo\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
        "ProcesoHijoKt"
    ).start()

    val writer = BufferedWriter(OutputStreamWriter(proceso.outputStream))
    val reader = BufferedReader(InputStreamReader(proceso.inputStream))
    val scanner = Scanner(System.`in`)

    while (true) {
        print("Adivina el numero (0-10): ")
        val numero = scanner.nextLine()

        if (!proceso.isAlive) {
            println("El proceso hijo termino.")
            break
        }

        writer.write(numero)
        writer.newLine()
        writer.flush()

        // Aquí leemos la respuesta del hijo, esperamos bloqueante
        val respuesta = reader.readLine()
        if (respuesta != null) {
            println("Hijo dice: $respuesta")
            if (respuesta.contains("Correcto")) {
                break
            }
        }
    }

    writer.close()
    reader.close()
    proceso.destroy()
    println("Fin del juego.")
}
