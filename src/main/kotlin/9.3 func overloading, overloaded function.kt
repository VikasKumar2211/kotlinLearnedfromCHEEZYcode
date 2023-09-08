fun main(){
    println(addition(1, 2))
    println(addition(1.0, 2.0))
}
fun addition(a: Int, b: Int): Int
{
    return a + b
}
fun addition(a: Double, b: Double): Double
{
    return a + b
}