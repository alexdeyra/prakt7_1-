
import kotlin.math.exp
import kotlin.math.ln

fun summaN(b1: Int, n: Int, q: Int): Double {
    return (b1 * (exp(n.toDouble() * ln(q.toDouble())) - 1)) / (q - 1)
}

fun main() {
    try {
        print("введите через пробел первый член ГП, номер крайнего члена ГП, и знаменатель: ")
        val input = readLine()
        val values = input?.split(" ")?.map { it.toInt() }
        if (values != null && values.size == 3) {
            val a = values[0]
            val b = values[1]
            val c = values[2]
            for (i in 1..b) {
                if (i % 2 == 0) {
                    println("%.3f".format(summaN(a, i, c)))
                }
            }
        }
    }catch (e: Exception) {println("вы ввели не то")}
}