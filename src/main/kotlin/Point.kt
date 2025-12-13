class Point(val x: Double, val y: Double)
class Triangle(val a: Point, val b: Point, val c: Point)
{
    fun area(): Double {
        return kotlin.math.abs(
            a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2  // формула площади треуголника по координатам
    }

    fun contains(p: Point): Boolean {
        val s = this.area()
        val t1 = Triangle(p, b, c)
        val t2 = Triangle(a, p, c)
        val t3 = Triangle(a, b, p)

        val sum = t1.area() + t2.area() + t3.area()

        return kotlin.math.abs(s-sum)<0.01
    }
}