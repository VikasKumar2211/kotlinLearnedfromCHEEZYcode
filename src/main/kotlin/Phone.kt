// open class means that this class is inheritable
// Phone is parent class and BasicPhone,SmartPhone are child class
open class Phone {
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {}
    fun powerOff() {}
    fun getDeviceInfo() {}
}