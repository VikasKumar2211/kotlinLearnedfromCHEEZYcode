fun main(){
    val obj = Outer()
    obj.i

    val nested = Outer.Nestedwaliclass()
    nested.test()
}

class Outer{
    var i = 0
    class Nestedwaliclass{// class ke ander class is nested class
        fun test() {
        println("I am ina class which is nested class or nasty hideous creep $ i")// hum i class nhii kar sakte
        }                                                                              // lekin aisa inner class mei kar sakte
    }
}