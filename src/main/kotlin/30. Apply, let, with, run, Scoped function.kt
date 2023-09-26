fun main(){
    val emp = Employee()
    emp.age = 21
    emp.name = "Karan"

  /*var x = */ emp.apply {
        age = 20
        name = "Vikas"
    }
    println(emp)
}

data class  Employee(var name: String = "", var age: Int =18)