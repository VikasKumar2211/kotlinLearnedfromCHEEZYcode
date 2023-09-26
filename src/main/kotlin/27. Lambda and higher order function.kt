import kotlin.math.pow

fun main(){
    println(sum27(2.0, 3.0))
    println(power27(2.0, 3.0))

    var fn: (a: Double, b:Double) -> Double = :: power27
    println(fn(5.0, 7.0))

    calculator(5.0, 5.0, ::power27)
}

fun sum27(a: Double, b:Double): Double{
    return a + b
}

fun power27(a: Double, b:Double): Double{
    return a.pow(b)
}

fun hello(a: Int) : Unit{}

fun calculator(a: Double, b: Double, gn: (Double,Double) -> Double){  //higher order function, function ke inout mei function daal diya
    val result = gn(a,b)
    println(result)
}