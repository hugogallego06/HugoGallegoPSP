import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val proceso = ProcessBuilder(
        "C:\\Users\\Hugo\\.jdks\\openjdk-22.0.2\\bin\\java.exe",
        "-javaagent:C:\\Users\\Hugo\\intelliJ\\IntelliJ IDEA Community Edition 2024.2.1\\lib\\idea_rt.jar=57936:C:\\Users\\Hugo\\intelliJ\\IntelliJ IDEA Community Edition 2024.2.1\\bin",
        "-Dfile.encoding=UTF-8",
        "-Dsun.stdout.encoding=UTF-8",
        "-Dsun.stderr.encoding=UTF-8",
        "-classpath",
        "C:\\Users\\Hugo\\Documents\\GitHub\\HugoGallegoPSP\\funcion\\out\\production\\funcion;C:\\Users\\Hugo\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.0.20\\kotlin-stdlib-2.0.20.jar;C:\\Users\\Hugo\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
        "HijoKt"
    )

    val procesoEjecutado = proceso.start()

    val array = arrayOf("hola","desde","el","proceso","padre");


    val output= OutputStreamWriter(procesoEjecutado.outputStream)

    //output.write(array.toString())

    output.write(array.joinToString(",")+"\n")
    output.flush()
    val input = procesoEjecutado.inputStream
    val leer= BufferedReader(InputStreamReader(input))
    print(leer.readLine())
    //print(array.joinToString(","))

    //print(array.toString())

    /*output.write("Hola hijo\n")
    //output.flush()

    //val input = BufferedReader(InputStreamReader(procesoEjecutado.inputStream)).readLine()

    println(input)*/
}