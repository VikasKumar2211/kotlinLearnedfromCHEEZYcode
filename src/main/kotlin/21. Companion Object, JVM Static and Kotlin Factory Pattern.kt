fun main(){
    MyClass21.MyObject21.f()
    MyClass21.AnotherObject21.g()
    MyClass21.g()// Humne Another Object ko companion bana, no need to write .AnotherObject
}



class MyClass21 {
    object MyObject21{
        fun f(){
            println("Hello I am f from MyObject")
        }
    }
    companion object AnotherObject21{
        fun g(){
            println("Hello I am G from AnotherObject")
        }
    }
}