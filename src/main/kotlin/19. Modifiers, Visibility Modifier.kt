fun main(){
    val obA = A1()
    val obB = B()

    obB
}

open class A1{
    public var p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40
}
var b = 20
class B: A1(){
    fun test(){
        println(p)
     //   println(q) // Q private hai hence error
        println(r)
        println(s)
    }
}

fun gn(){

}