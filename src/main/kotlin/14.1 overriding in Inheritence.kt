// it means child class can override/change the parent class
fun main() {
    val oneplus = OnePlus("Mehenga phone")
    oneplus.display()
    val generalMobile = Mobile("Mehenga Phone")
    generalMobile.display()
    println(generalMobile.type)
}

open class Mobile(val type: String){
  open val name : String = ""
   open val size: Int = 5
    fun makeCall() = println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
   open fun display() = println("Simple Mobile Display")//open means we can override this fun
}

class OnePlus(typeParam : String) : Mobile(typeParam)
{
    override val name: String ="One Plus"
    override val size: Int = 6
    override fun display() = println("One Plus Display")
    /*{
        super.display()
        println("One Plus Display")

    }*/

}