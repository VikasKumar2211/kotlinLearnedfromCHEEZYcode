fun main(){
    val emp = Employee301()
    emp.age = 21
    emp.name = "Karan"

    println(emp)

    println(emp.age)
    println(emp.name)


    var xx = emp.let{
        println(it.name)
        println(it.age)
        2.02
    }
    println(emp)

    emp.let{
        it.age = 21
        it.name= "Deepesh"
    }
    println(emp)

    var x = with(emp){
        age = 30
        name = "XYZ"
        "jkhgs"
    }// iski bhu return value last wale pr depend karti hai
    println(emp)

    emp.run{
        age = 35
        name = "PQR"
    }
    println(emp)
}

data class  Employee301(var name: String = "", var age: Int =18)