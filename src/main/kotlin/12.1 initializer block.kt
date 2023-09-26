fun main(){
    var car = Gaddi("Thar", 4, 5, true)//thar 4 and 5 are default values of type automobile

}
class Gaddi(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean)//name tyre and maxseating is properties of
// class = automobile
//(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean) is constructor
{
    init {println("$name is created")}// initializer block
    var airBags = hasAirBags
    init{println("2nd Initializer Block")}
    fun drive(){}                                                    //drive and applybreak is methods and is object
    fun applyBreak(){}
}