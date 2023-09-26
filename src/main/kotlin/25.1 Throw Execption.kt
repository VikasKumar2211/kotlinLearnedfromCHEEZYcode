fun main (){
    createUserList(5)
    createUserList(-2)///error
}

fun createUserList(count: Int){
    if(count<0){
        // Exception raises
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User lit create containing $count users")
    }
}