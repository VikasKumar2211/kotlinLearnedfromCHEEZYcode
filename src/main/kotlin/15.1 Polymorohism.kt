//Poly means many and Morph means form
//In computer science, it is defined as - method name is same but it will behave differently based on the object
fun main(){
    val shape = Sape()
    printArea(shape)
    val square = Sqaure(5.44)
    printArea(square)
    val circle = Cirkle(43.7)
    printArea(circle)
}

fun printArea(shape: Sape){
    println(shape.area())
}
open class Sape{
    open fun area() : Double = 0.0
}
class Cirkle(val radius:Double): Sape(){
    override fun area(): Double = Math.PI * radius * radius
    }
class Sqaure(val side: Double) : Sape(){
    override fun area(): Double = side * side
    }
class Triangal(val base: Double, val height:Double) : Sape(){
    override fun area(): Double = 0.5 * base * height
}