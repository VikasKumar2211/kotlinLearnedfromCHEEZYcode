fun main(){
    val number = 2
    for (i in 1 .. 10){
        // 2 x i = 2i
        println("$number x $i = ${number*i}")// string templating, more readable
    }
}