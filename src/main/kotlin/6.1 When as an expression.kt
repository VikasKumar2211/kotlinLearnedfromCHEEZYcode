fun main() {
   val animal = "Dog"
    val result = when (animal) {
        "Horse" -> "Animal is Horse"
        "Cat" ->"Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "ye konsa janwar hai be"
    }
    println(result)
}