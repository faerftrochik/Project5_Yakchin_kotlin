class Point(val x: Double, val y: Double)

fun area(a: Point,b: Point,c: Point): Double {
    return kotlin.math.abs(
        a.x*(b.y-c.y)+b.x*(c.y-a.y)+c.x*(a.y-b.y)
    ) / 2
}

class Pointik(val x: Double, val y: Double)

class Poi(val x: Double, val y: Double)



fun main(args: Array<String>) {

    println("Приветствую")
    println("Список задач:")
    println("Первая задача - 1")
    println("Вторая задача - 2")
    println("Третья задача - 3")
    println("Введите задачу какую хотите увидеть - ")

    val inp = readLine()

    when (inp)
    {
        "0" -> return
        "1" -> teat1()
        "2" -> teat2()
        "3" -> teat3()

        else -> print("Ввести надо одну цифру...")
    }
}

fun teat1()
{
    //Задание 1

    println("Вы вошли в задачу 1 ")

    val a = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val b = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val c = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val p = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    val s = area(a,b,c)
    val s1 = area(p,b,c)
    val s2 = area(a,p,c)
    val s3 = area(a,b,p)

    if (kotlin.math.abs(s - (s1+s2+s3)) < 0.01)
        println("Внутри")
    else
        println("Снаружи")


}

fun teat2()
{
    //Задание 2

    println("Вы вошли в задачу 2 ")

    val a = Pointik(readLine()!!.toDouble(), readLine()!!.toDouble())
    val b = Pointik(readLine()!!.toDouble(), readLine()!!.toDouble())

    val dx = a.x - b.x
    val dy = a.y - b.y
    val d = kotlin.math.sqrt(dx*dx + dy*dy)

    println(d)

}

fun teat3()
{
    //Задание 3

    println("Вы вошли в задачу 3 ")

    val n = readLine()!!.toInt()
    val p = Array(n){Poi(0.0,0.0)}

    for (i in 0 until n)
        p[i] = Poi(readLine()!!.toDouble(), readLine()!!.toDouble())

    var min = 1e18
    var max = 0.0

    for (i in 0 until n)
        for (j in i+1 until n) {
            val dx = p[i].x - p[j].x
            val dy = p[i].y - p[j].y
            val d = kotlin.math.sqrt(dx*dx + dy*dy)
            if (d < min) min = d
            if (d > max) max = d
        }

    println("Минимум: $min")
    println("Максимум: $max")

}

