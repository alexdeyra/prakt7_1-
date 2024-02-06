import kotlin.math.abs
import kotlin.math.pow


fun main() {
    try {
        var x = readLine()!!.toDouble()

        var z = (5 * (x.pow(3))) + (70 * (x.pow(2))) + 14 * x
        var r = abs(((5 * x + 70) * x + 14)) * x
        println(z)
        println(r)
    } catch (e: Exception) {
        println("вы ввели не то")
    }
}