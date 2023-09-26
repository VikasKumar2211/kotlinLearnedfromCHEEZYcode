fun main(){
  //  println(A20.p)
    println(A20.num)
    println(B20.p)
    println(B20.test())
    B20.test()
}

object A20{
    val num: Int = 10
}

object  B20{
    val p: Int = 20
    fun test(){
        println("I am object B20")
    }
}