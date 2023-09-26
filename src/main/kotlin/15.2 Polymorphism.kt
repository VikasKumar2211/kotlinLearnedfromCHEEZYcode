fun main(){
     val circle = Circal(7.0)
    println(circle.area())
    println(circle.toString())
}
open class akar{
    open fun area() : Double = 0.0
// when this part is commented, program goes to circal class and unable to
// find toString then goes to akar then goes to Any class, sab classes ka baap Any classf
/* override fun toString(): String {
        return "i am akar"
    }*/
}
class Circal(val radius: Double) : akar(){
    override fun area(): Double = Math.PI * radius * radius
}