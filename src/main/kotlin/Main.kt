
class Poi(val x: Double, val y: Double)

fun distik(a: Poi,b: Poi): Double =
    kotlin.math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y))

class Pointi(val x: Double, val y: Double)
{
    fun dist(o: Pointi): Double =
        kotlin.math.sqrt((x-o.x)*(x-o.x)+(y-o.y)*(y-o.y))
}

class Point(val x: Double, val y: Double)

class Triangle(val a: Point, val b: Point, val c: Point)
{
    fun contains(p: Point): Boolean
    {
        fun area(p1: Point,p2: Point,p3: Point): Double =
            kotlin.math.abs(
                (p1.x*(p2.y-p3.y)+p2.x*(p3.y-p1.y)+p3.x*(p1.y-p2.y))/2
            )
        val A = area(a,b,c)
        val A1 = area(p,b,c)
        val A2 = area(a,p,c)
        val A3 = area(a,b,p)
        return kotlin.math.abs(A - (A1+A2+A3)) < 0.0001
    }
}

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

    println("Введите координаты треугольника:")
    val a = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val b = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val c = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    println("Введите координаты точки:")
    val p = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    val t = Triangle(a,b,c)
    if (t.contains(p)) println("Точка внутри")
    else println("Точка вне")

}

fun teat2()
{
    //Задание 2

    println("Введите координаты первой точки:")
    val a = Pointi(readLine()!!.toDouble(), readLine()!!.toDouble())
    println("Введите координаты второй точки:")
    val b = Pointi(readLine()!!.toDouble(), readLine()!!.toDouble())
    println("Расстояние: ${a.dist(b)}")
}

fun teat3()
{
    //Задание 3

    println("Введите количество точек (>2):")
    val n = readLine()!!.toInt()
    val arr = Array(n){Point(0.0,0.0)}
    for (i in 0 until n){
        println("Точка ${i+1}:")
        arr[i] = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    }

    var min = Double.MAX_VALUE
    var max = 0.0

    for (i in 0 until n){
        for (j in i+1 until n){
            val d = distik(arr[i],arr[j])
            if (d < min) min = d
            if (d > max) max = d
        }
    }
    println("Мин расстояние: $min")
    println("Макс расстояние: $max")
}

