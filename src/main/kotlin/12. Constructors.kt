// Constructors
//class has two things, classes and objects
// Constructor initialize objects and provide default values to properties
// Automobile is class and car is object of class automobile
fun main(){
    var car = Automobile("Thar", 4, 5, true)//thar 4 and 5 are default values of type automobile
     println(car.name)
     println(car.airBags)
   var jeev = Person("Vikas", 8)//object jeev is of Person class, classes are
                                               //public in kotlin means they can be used anywhere, class Person is defined in 11.1
    println(jeev.bandeKaNaam)
    println(jeev.age)
    println(jeev.canVote())
     var jeev2 = Aadmi("B", 90)
    println(jeev2.name)
    println(jeev2.age)
    println(jeev2.canVote)

}
//(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean) is a constructor or primary constructor
class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean)//name tyre and maxseating is properties of
                                                                      // class automobile
{
    var airBags = hasAirBags
    fun drive(){}                                                    //drive and applybreak is methods and is object
    fun applyBreak(){}
}
class Empty{}
class Aadmi(nameParam: String, ageParam:Int)
{
    //var name: String  = nameParam
    var name: String  = "$nameParam - Clan"
    var age:Int = ageParam
    var canVote: Boolean = ageParam>18
}