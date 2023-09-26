fun main(){
     val circle = Cirkal(3.14)
    println(circle.area())
    circle.display()

}

abstract class A{
    fun method1(){
        println("I am method")
    }
}
abstract class sep{
    var name: String = ""
    abstract fun area() : Double
    abstract fun display()
}

class  Cirkal(val radius: Double) : sep(){
    override fun area(): Double = Math.PI * radius * radius
     override fun display() {
       println("Circle is getting displayed")
    }
}