fun main(){
    val p1 = Person22(1, "John")
    val p2 = Person22(1, "John")

    println(p1)// toString
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)// iska answer false aayega even if hum name property ko comment kyu na kar de
                     // to solve this problem we will use data class instead of class

    val p3 = p1.copy(id = 3/*, name = "Vikas"*/)// copy is utility function of data class
    println(p3)

    // Destructuring
    val (id, name) = p1//2 variable ban gye hain id aur name naam ke, isme p1 ka naam aur id save ho gyi hai
    println(id)
    println(name)
    println(p1.component1())// id
    println(p1.component2())// name

}

data class Person22(val id: Int, val name: String){}