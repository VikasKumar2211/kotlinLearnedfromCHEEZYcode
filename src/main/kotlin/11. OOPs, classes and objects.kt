fun main(){
    val thar = Car("Mahindra Thar", "petrol", 23400)// car is the class
    val nexon = Car("Tata Nexon", "diesel", 450)// thar and nexon are objects of class car
    println(thar.name)// dot (.) is operator
    println(thar.type)
    println(thar.kmRan)
    println(nexon.name)
    println(nexon.kmRan)
    println(nexon.type)
    nexon.driveCar()
    nexon.applyBrakes()
    thar.driveCar()
    thar.applyBrakes()
}
class Car (val name: String, val type: String, var kmRan : Int)// kmRan, tyoe and name are Properties, it's basically data
{
    fun driveCar()//methods, method is a function that work on that data, method and function are similar
    {
        println("$name Car is driving")
    }
    fun applyBrakes(){
        println("Applied Brakes on $name")
    }
}