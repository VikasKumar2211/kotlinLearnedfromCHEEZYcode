fun main(){
    println("Hello Papa Vikas".formattedString())
}

fun String.formattedString(): String{
    return "-----------------\n$this\n---------------------"   //\n se next line hoti hai
}