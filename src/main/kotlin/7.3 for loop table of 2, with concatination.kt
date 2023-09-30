fun main(){
    val number = 2
    for (i in 1 .. 10){
        // 2 x i = 2i
        println(number.toString() + " x " + i + " = " + (number*i) )// concatination, its less readable
    }
}