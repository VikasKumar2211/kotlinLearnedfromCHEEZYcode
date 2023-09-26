fun main(){
    val students = mutableMapOf<Int, String>()
    students.put(1, "Ryan")
    students.put(2, "John")
    students.put(3, "Katie")
    students.put(4, "Arav")

    println(students.get(1))
    println(students.get(11))

    for ((key, value ) in students){
        println("$key = $value")
    }

    //get and set karna
    students[8] = "Jones"
    println(students[8])
    for ((key, value ) in students){
        println("$key = $value")
    }


    val map = mapOf<Int, String>(1 to "Hello", 2 to "World")
    println("immutable map")
    println(map)
}