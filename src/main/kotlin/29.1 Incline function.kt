fun main (){

    calculateTimeAndRun{
        loop(10000)
    }

}
//inline bas performance benefit milta hai
inline fun calculateTimeAndRun(fn: ()-> Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("time taken ${end-start} ms")
}
fun loop(n: Long){
    for(i in 1..n){
        //
    }
}