class koiGaadi(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String = "Petrol") {

    init {
        println("$name is created")
    }

    fun drive() {}

    fun applyBreak() {}
}

fun main() {
    var car = koiGaadi("Thar", 4, 5, "Diesel")
}
