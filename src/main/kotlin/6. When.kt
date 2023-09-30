fun main(){
    val animal = "Vikas"
    val animal310 = "Vikas"// this variable for when statement
    if(animal == "Horse"){
        println("Animal is Horse")
    }
    else if(animal == "Cat"){
        println("Animal is Cat")
    }
    else if(animal == "Dog"){
        println("Animal is Dog")
    }
    else{
        println("Animal is not found, $animal is not in the list")
    }// by if else, this code is long,
    // we can make this code short by using "when statement"
    // when is more readable
    when(animal310){
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("$animal310 ? ye konsa janwar hai be")
    }
}
//both code works same, 'when' have more readability