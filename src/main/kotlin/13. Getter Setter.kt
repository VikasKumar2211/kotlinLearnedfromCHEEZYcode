fun main(){
    val ob = Calculator()// no constructer added in class Calculator that's why we have to use (), also default constructor which is parameterless
    println(ob.add(7, 3))
    println(ob.multiply(7, 8))
}
class Calculator{
    lateinit var message: String// lateinit is used hen we don't know initialise value, iske saath var hi use karna hoga, we can only use non-primitive data type with lateinit, comment the lateinit word to see that error
    fun add(a: Int, b: Int) :Int{
        return a+b
    }
    fun multiply(a: Int, b: Int): Int{
        return a*b
    }
}