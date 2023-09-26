//IS-A relationship, like circle is a shape, dog is an animal
fun main(){
   // val objChild = Child()
  //  objChild.myMethod()
 //   objChild.myMethod2()
}

open class Parent
{
    init {
          println("Parent's constructor is called")
    }
    val name :String = ""
    fun myMethod(){
        println("I am in Parent")
    }
}

class Child : Parent()
{
    init {
        println("Child's constructor is called")
    }
    val name2 : String = ""

    fun myMethod2(){
        println("i am in Child")
    }
}
// neeche wala same code bas aage peeche kar diya to prove that
// parent constructor will be called first as it is superclass
/*class Child : Parent()
{
    init {
        println("Child's constructor is called")
    }
    val name2 : String = ""

    fun myMethod2(){
        println("i am in Child")
    }
}
open class Parent
{
    init {
        println("Parent's constructor is called")
    }
    val name :String = ""
    fun myMethod(){
        println("I am in Parent")
    }
}*/