fun main(){
    val circle = Circle18(9.0)
    val player = Player18 ("Sabki bajadu been")

  /*  val arr: Array<Draggable18> = arrayOf(circle, player, Test())// Test class mei Draggable nhi hai isiliye error
    for(obj in arr){
        if(obj is Circle18){
        println(    obj.area())
        }
        else{
            (obj as Player18).sayMyName()
        }
    }
}*/
val arr = arrayOf(circle, player, Test())//humne Array<Draggable> ko remove kar diya toh usne Any class ko use kar liya
for(obj in arr){
    if(obj is Circle18){
        println(    obj.area())
    }
    else{
        (obj as Player18).sayMyName()
    }
}
}


interface Draggable18{
    fun drag()
}

abstract class Shape18 : Draggable18{
    abstract fun area() : Double

}

class Circle18(val radius:Double): Shape18(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Cricle is dragging")
}

class Player18(val name: String): Draggable18{
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey my name is - $name")
}
class Test{

}