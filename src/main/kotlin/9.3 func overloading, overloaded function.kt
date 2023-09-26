fun main(){
    println(jodo(1, 2))
    println(jodo(1.0, 2.0))
}
fun jodo(a: Int, b: Int): Int
{
    return a + b
}
fun jodo(a: Double, b: Double): Double
{
    return a + b
}