// it means child class can override/change the parent class
// Any is super class of all classes by default, it have many methods like hashnode, toString
fun main() {
    val ekplus = EkPlus()
    ekplus.display()
    val generalMobile = Mobile("Mehenga Phone")
    generalMobile.display()
    println(generalMobile.type)
    println(ekplus.size)
    println(ekplus.powerOff())
    println(ekplus.toString())
}

open class Mobileba(val type: String){
    open val name : String = ""
    open val size: Int = 5
    fun makeCall() = println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")//open means we can override this fun
}

class EkPlus : Mobileba("Mehenga Phone")
{
    override val name: String ="One Plus"
    override val size: Int = 8
    override fun display() /*= println("One Plus Display")*/
    {
        super.display()
        println("One Pl Display")

    }

    override fun toString(): String {
        return "EkPlus(name='$name', size=$size)"
    }

}