import kotlin.math.*
import kotlin.math.pow
fun main() {
//    1.3

//    try {
//       var m: Int;
//        var n: Int;
//        var am: Double;
//        var an: Double;
//        var sum: Double;
//        do {
//        println("Введите номера элементов прогрессии 0<m<n")
//        m = readLine()!!.toInt()
//            n = readLine()!!.toInt()
//        } while (m <= 0 || n <= m)
//        println("введите значения элементов")
//        am = readLine()!!.toDouble()
//        an = readLine()!!.toDouble()
//        sum = (am + an) * (n - m + 1) / 2
//        println(sum)
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 1.19

//    try {
//        var number:Int;
//        do {
//            println("Введите трехзначное число")
//            number = readLine()!!.toInt()
//        } while (number < 99 || number > 999)
//        var first = (number % 10).toString();
//        var second = (number / 10 % 10).toString();
//        var third = (number / 100).toString();
//        println(first + second + third)
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 1.7(3)

    try {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите y")
        var y = readLine()!!.toDouble()
        println("Введите z")
        var z = readLine()!!.toDouble()
        var a = (2.0 * cos(x - (PI/6.0))) / ((1/2) + ((sin(y)) * (sin(y))))
        var b = 1 + ((z*z) / (3 + ((z*z)/5)))
       println(a)
        println(b)
    }
    catch (e:Exception)
    {
        println("Введенное число неверно")
    }
}