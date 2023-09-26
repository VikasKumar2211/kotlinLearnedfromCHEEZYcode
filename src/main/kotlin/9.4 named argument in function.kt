//named argument, ye jab use karte hai jab bahut saare parameter hote hai
fun main(){
    println(addition(a = 2, b = 6))
    println(addition(b = 3, a = 9))// sequence doesn't matters as we have assigned the value to a and b
}
fun addition(a: Int, b: Int): Int
{
   return a + b
}
fun addition(a: Double, b: Double): Double
{
    return a + b
}