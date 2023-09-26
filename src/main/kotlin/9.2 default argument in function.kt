fun main(){
    printMessage()//default argument ko le lega
    printMessage(78)
}
fun printMessage(count: Int = 3)//count variable is parameter, 3 is default argument
{
    for(i in 1..count){
        println("hello $i")
    }
}