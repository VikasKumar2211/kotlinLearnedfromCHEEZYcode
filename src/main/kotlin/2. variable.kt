// var can be reassigned
// val can't
fun main(){
    var score = 5
    score = 34
    println(score)
    // type inference, value se data type nikalna, ctrl + shift + p

    val message = "Welcome to Shahbad Tech City"
    //message = "Welcome to Tech Street" //you have to create a tech city not tech street

    println(message)
//}
//fun main(){ // explicitly defining the data type
    var score2 : Int = 12
    var temperature: Double = 89.4
    var isRaining: Boolean = false
    var alphabet: Char = 'A'
    var message45215: String = "Hello World"
    println("$ fscore $temperature $isRaining $alphabet $message")
}
