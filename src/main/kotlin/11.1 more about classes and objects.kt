//more about clasees and object
// we create user define data type
// classes are cookie cutter like star or heart or any other shape and the cookies are actual objects
fun  main(){
    var i: Int =20
    println(i.plus(70))
    println(i.toFloat())

    val p1 = Person("A", 21)
    val p2 = Person("B", 17)
      println(p1.canVote())
      println(p2.canVote())

      //one year later p2 become 18, lol
      p2.age = 18
      println(p2.canVote())
}
class Person(val bandeKaNaam: String, var age:Int)//properties
{
    // Method, canVote is method
    fun canVote(): Boolean{
          return age>=18
    }
}