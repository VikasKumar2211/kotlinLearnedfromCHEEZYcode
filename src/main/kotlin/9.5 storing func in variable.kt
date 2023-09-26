import kotlin.math.pow//library
fun main(){ // addition mei intentional typo kyuki addition word ko pehle hi use kar kar liya
    var fn: (a: Double, b: Double) -> Double = ::adition //fn is function name
    println(fn(1.0, 3.0))
    fn =::power
    println(fn(3.0, 5.9))
}
fun adition(a: Double, b: Double): Double
{
    return a + b
}
fun power(a: Double, b: Double): Double
{
    return a.pow(b)
}