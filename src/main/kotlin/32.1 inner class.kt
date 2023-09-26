fun main(){
    val obj = Outer321()
    obj.i

    //val nested = Outer321.Nestedinnerclass()// hum isko directly call nhi kar sakte, outer321 ka bhi object banana hoga
    //nested.test()
    val inner = Outer321().Nestedinnerclass()
    inner.test()
}

class Outer321{
    var i = 6969
    inner class Nestedinnerclass {
        // class ke ander class is nested class
        fun test() {
            println("I am ina class which is nested class or nasty hideous creep $i")
        }
    }
}