// this variaton if if else is only available in kotlin, using if else as an expression
fun main (){
    val x= 10
    val y = 10
    val result = if( x > y ){
        "X is greater than Y"
    }
    else if(x < y){
        "X is less than Y"
    }
    else{
        "X is equal to Y"
    }
    println(result)
}