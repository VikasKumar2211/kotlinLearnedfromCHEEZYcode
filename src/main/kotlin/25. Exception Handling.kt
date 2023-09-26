import java.lang.Exception

fun main(){
    val arr = arrayOf(1, 2, 3)
    try {
        println(arr[5])
    }
    catch (ex: NullPointerException){

    }
    catch (e: Exception){// we can use multiple catch blocks
        println(" Please check the array index")
    }
    finally {
        println("I will executeno matter what")
    }
  //  println(arr[5])// nothing is on fifth position
    println("This will not run")

    try { }
    catch(e: Exception){}

    try{}
    finally{}

    //try{}// try humesa catch ya finally ke saath hi ayega


}