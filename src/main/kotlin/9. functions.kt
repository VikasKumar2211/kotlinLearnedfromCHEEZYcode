/* syntax format of functions
 fun functionkanaam(parameter1, parameter2....):Returntype //matlab output value ka type, i.e return value ka type
 {                                                         // parameter are just inputs
     //block of code
     return result
 }
*/
fun  main()//function
{
    val result = add(10,5) //10 aur 5 argument hai
    println(result)
    evenORodd(145)
}
fun add(num1: Int, num2: Int): Int // the variables num1 num2 are actually parameter(these variable are val type which can't be reassign)
{
    val sum = num1 + num2
    return sum
}
fun evenORodd(input: Int)
{
    val jawab = if(input % 2 == 0) "Even" else "Odd"
    println(jawab)
}