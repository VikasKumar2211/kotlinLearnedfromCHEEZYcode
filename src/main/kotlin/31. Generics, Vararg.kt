fun main(){
    val obj = IntContainer(3)
    obj.getValue()

    val iContainer = GenericContainer<Int>(453)
    iContainer.getValue()

    val sContainer = GenericContainer<String>("5fd")
    sContainer.getValue()

    val list = listOf<String>()
}

class IntContainer(var data: Int){
    fun setValue(value: Int){
        data = value
    }
    fun getValue(): Int{
        return data
    }
}

class StringContainer(var data: String) {
    fun setValue(value: String) {
        data = value
    }

    fun getValue(): String {
        return data
    }
}

class GenericContainer<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}