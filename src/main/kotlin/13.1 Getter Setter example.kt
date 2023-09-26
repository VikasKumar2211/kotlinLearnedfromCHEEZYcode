fun main(){
    val p1 = perman("aviod egirls", 9)// can't use person as we have already used person as class previously
    println(p1.age)
    p1.age = 23
    println(p1.age)
    p1.age = -43// age can't be minus but the code will run so to prevent we will use setter in class code
    //println(p1.age)
    println(p1.name)
}
class perman(nameParam:String, ageParam: Int){
    var name:String = nameParam
        get(){
            println("Name getter is called")
            return field.toUpperCase()
        }
  var age:Int = ageParam

        set(value) {
            if(value > 0){
                field = value
            }
            else{
                println("Age can't be negative")
            }
        }
    //default syntax of getter and setter
    var email : String = ""
        get() = field
        set(value) {
            field = value
        }

}