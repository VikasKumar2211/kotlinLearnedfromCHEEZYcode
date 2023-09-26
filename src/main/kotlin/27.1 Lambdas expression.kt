fun main(){
    var fn: (a: Int, b: Int) -> Int = ::sum2
    val lambda1 = {x: Int, y: Int -> x + y}
    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2+3
        "Hello Vikas"
    }
    multiLineLambda()
    println(multiLineLambda())

    val singleParamLamba= {x: Int -> x*x}
    val lambda2: (Int)->Int = {x -> x * x}

    val sayHi ={msg: String -> println("Hello $msg") }
    val sayHi2: (String) -> Unit = {msg -> println("Hello $msg") }

    val singleParam: (Int) -> Int = {x -> x + x}// show some contex action se hum iss x ko bhi it se replace kar sakte
    val simplifySingleParam: (Int) -> Int = {it + it}


    calculator(1, 2) { a, b -> a + b }
    // or calculator(1, 2, { a, b -> a + b })f
}

fun sum2(a: Int, b:Int) : Int = a + b

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int{
    return op(a, b)
}