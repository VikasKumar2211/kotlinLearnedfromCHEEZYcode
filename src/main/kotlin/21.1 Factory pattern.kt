// Pizza Factory
fun main(){
    var pizza1 = Pizza.Factory.create("Peppy Paneer")
    println(pizza1)
    // Here I am calling via Factory - don't want to use Factory ref ? make Factory a Companion Object
    var pizza2 = Pizza.create("Tomato")
    println(pizza2)

    // One more thing we can do - We want everyone to call this create method if tey want pizza
    // for that we will mark the constructor as private, for that write "private constructor" before the constructor
   // var pizza3 = Pizza("", "")// now everyone needs to call create Methods i.e. everyone has to call its Factor
}
//Example of Factory Pattern Using Companion
class Pizza private constructor(val type: String, val toppings: String){
    companion object Factory{
        fun create(pizzaType: String) : Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Toamto", "Tomato, Cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm", "Paneer, Cheese Burst, Tomato, Onion")
                else -> Pizza("Basic", "Onion, Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type', toppings='$toppings')"
    }
}