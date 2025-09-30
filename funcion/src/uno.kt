import java.io.BufferedReader
import java.io.InputStreamReader

/*val nombre= "arp -a"
val proceso= ProcessBuilder("cmd.exe","/c","arp -a")
val procesoTemporal = proceso.start()
*/
    //println(procesoTemporal.inputStream.bufferedReader().readText())

    //println(procesoTemporal.isAlive)

    //val lector= BufferedReader(InputStreamReader(procesoTemporal.inputStream))
    //var linea:String?
    /*while (lector.readLine().also { linea = it } != null){
        print(linea)
    }*/

    //print("Se ha ejecutado $nombre")
fun main(args:Array<String>){
            val command = listOf(
                "C:\\Users\\Hugo\\.jdks\\openjdk-22.0.2\\bin\\java.exe",
                "-javaagent:C:\\Users\\Hugo\\intelliJ\\IntelliJ IDEA Community Edition 2024.2.1\\lib\\idea_rt.jar=50605:C:\\Users\\Hugo\\intelliJ\\IntelliJ IDEA Community Edition 2024.2.1\\bin",
                "-Dfile.encoding=UTF-8",
                "-Dsun.stdout.encoding=UTF-8",
                "-Dsun.stderr.encoding=UTF-8",
                "-classpath",
                "C:\\Users\\Hugo\\Documents\\GitHub\\HugoGallegoPSP\\funcion\\out\\production\\funcion;" +
                        "C:\\Users\\Hugo\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.0.20\\kotlin-stdlib-2.0.20.jar;" +
                        "C:\\Users\\Hugo\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
                "LlamarKt"
            )

            val process = ProcessBuilder(command)
                .redirectErrorStream(true)
                .start()

            BufferedReader(InputStreamReader(process.inputStream)).use { reader ->
                val linea = reader.readLine()
                if (linea != null) {
                    println(linea.uppercase())
                } else {
                    println("No se recibió salida del proceso.")
                }
            }
        }