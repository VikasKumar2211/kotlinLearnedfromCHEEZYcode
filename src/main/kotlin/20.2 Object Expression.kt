// object without name
/*fun main (){
    var testObj = object {
        val x : Int = 10
        fun method(){
            println("I am object expression")
        }
    }
    println(testObj.method())
}*/
fun main (){
    var obj2 = object : Person20("Vikas ka Bootcamp") {
        override fun fullName(){
            super.fullName()
            println("Anonymous - $name")
        }
    }
    obj2.fullName()

     var obj = object : Cloneable20 {
        override fun clone(){
            println("I am clone")
        }
    }
   obj.clone()
}

interface Cloneable20{
    fun clone()
}
open class Person20(val name : String){
    open fun fullName() = println("Full Name - $name")
}