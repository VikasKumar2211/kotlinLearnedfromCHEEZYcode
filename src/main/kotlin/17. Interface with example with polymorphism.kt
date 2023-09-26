fun main(){
dragObjects(arrayOf(Circle17(3.3), Square17(9.3), Triangle17(3.2, 2.2), Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }
}
interface Draggable{
    fun drag()
}
interface cloneable{
    val dragSpeed : Int
    fun clone()
}
abstract class Shape17 : Draggable, Cloneable{
    abstract fun area() : Double

}

class Circle17(val radius:Double): Shape17(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Cricle is dragging")
}
class Square17(val side: Double) : Shape17(){
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}
class Triangle17(val base: Double, val height:Double) : Shape17() {
    override fun area(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}
class Player(val name: String): Draggable{
    override fun drag() = println("$name is dragging")
}