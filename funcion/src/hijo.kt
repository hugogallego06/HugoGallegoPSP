import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val input= BufferedReader(InputStreamReader(System.`in`))
    val array = input.readLine().split(",").toTypedArray()
    print(array.joinToString(",")+"\n")
    /*val output= OutputStreamWriter(System.out)

    output.write(input.readLine().uppercase())

    output.flush() // limpia la salida
    */

    //println(input.readLine().uppercase())
}
