import kotlin.math.abs
import kotlin.math.log
import kotlin.math.pow

fun main() {
    try {

        println("Введите кол-во учеников")
        var n= readLine()!!.toDouble()
        println("Введите кол-во оценок ")
        println("Пятёрок")
        var a = readLine()!!.toDouble()
        println("Четвёрок")

        var b = readLine()!!.toDouble()
        println("троек")
        var d = readLine()!!.toDouble()
        println("Двоек")
        var c = readLine()!!.toDouble()
        var z= (0.25-(a-b)) / (0.125-(abs(b)/ (10.0.pow(n+3.0))+ log(b,10.0) /c-d))
        println(z)
    } catch (e:Exception) {println("вы вввели не цифру")}
}










