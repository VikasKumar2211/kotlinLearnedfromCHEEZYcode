// For using phone class use like that, getScreenInfo is the special method the Basic Phone have, other methods was same as Phone class
// Phone is parent class and BasicPhone/SmartPhone are child class
class BasicPhone  : Phone(){
    fun getScreenInfo(){}
}








// agar humne phone class ko use kiya hai toh same methods phirse likhne ki jarurat nhi hence the code is reusable
/*class BasicPhone  : Phone(){
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {}
    fun poweroff() {}
    fun getDeviceInfo() {}

    fun getScreenInfo(){}
}
*/