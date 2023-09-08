fun main(){
    val animal = "vikas"
    /*if(animal == "Horse"){
        println("Animal is Horse")
    }
    else if(animal == "Cat"){
        println("Animal is Cat")
    }
    else if(animal == "Dog"){
        println("Animal is Dog")
    }
    else{
        println("Animal is not found")
    }*/
    when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("ye konsa janwar hai be")
    }
}
//both code works same, 'when' have more readability