// Parent can hold reference to its child, and call reference to
// the child classes that's polymorphism
fun main(){
     val circle : Shape /*Circle*/ = Circle(5.6)
     val square : Shape /*Square*/ = Square(9.9 )
   //  println(circle.area())
    //println(square.area())
    val shapes = arrayOf(Circle(3.0), Triangle(5.0, 6.0), Square(4.0))
    calculateAreas(shapes)
}
fun calculateAreas(shapes: Array<Shape>){// by polymorphism, method calculateAreas ko badle bina
    for(shape  in shapes)                //hum kitne bhi shape area nikal sakte hai just like triangle
        println(shape.area())            // it make code maintainable and extensible
}
open class Shape{
    open fun area() :Double{
        return 0.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double{
        return Math.PI * radius * radius
    }
}

class Square  (val side : Double) : Shape(){
    override fun area(): Double{
        return side*side
    }
}
class Triangle(val base:Double, val altitude:Double) : Shape(){
    override fun area(): Double{
        return 0.5 * base * altitude
    }
}