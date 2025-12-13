
fun main(args: Array<String>) {

    println("Приветствую")
    println("Список задач:")
    println("Первая задача - 1")
    println("Вторая задача - 2")
    println("Третья задача - 3")
    println("Введите задачу какую хотите увидеть - ")

    val inp = readLine()

    when (inp) {
        "0" -> return
        "1" -> teat1()
        "2" -> teat2()
        "3" -> teat3()

        else -> print("Ввести надо одну цифру...")
    }
}

fun teat1() {
    //Задание 1

    println("Вы вошли в задачу 1 ")

    val a = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val b = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    val c = Point(readln().toDouble(), readLine()!!.toDouble())
    val p = Point(readln().toDouble(), readLine()!!.toDouble())

    val triangle = Triangle(a, b, c)

    if (triangle.contains(p))
        println("Внутри")
    else
        println("Снаружи")


}

fun teat2() {
    //Задание 2

    println("Вы вошли в задачу 2 ")

    println("Введите координаты x и y первой точки: ")
    val a = Point(readLine()!!.toDouble(), readLine()!!.toDouble())
    println("Введите координаты x и y второй точки: ")
    val b = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    val dx = a.x - b.x
    val dy = a.y - b.y
    val d = kotlin.math.sqrt(dx * dx + dy * dy)

    println(d)

}

fun teat3() {
    //Задание 3

    println("Вы вошли в задачу 3 ")

    val n = readLine()!!.toInt()
    val p = Array(n) { Point(0.0, 0.0) }

    for (i in 0 until n)
        p[i] = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    var min = 1e18
    var max = 0.0

    for (i in 0 until n)
        for (j in i + 1 until n) {    // перебор всех пар без повторов
            val dx = p[i].x - p[j].x
            val dy = p[i].y - p[j].y
            val d = kotlin.math.sqrt(dx * dx + dy * dy)
            if (d < min) min = d
            if (d > max) max = d
        }

    println("Минимум: $min")
    println("Максимум: $max")

}

