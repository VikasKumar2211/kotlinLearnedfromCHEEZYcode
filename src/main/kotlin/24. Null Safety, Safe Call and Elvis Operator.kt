fun main(){
    var gender : String = "Male" // "Female" , "Other"
    var gender2 : String? = null // ? lagane se String nullable ho jaati hai, remove ? to see the error
    var isAdult : Boolean? = null

    if (gender2 != null) {// humne bas gender.Touppercae likha tha baaki ka null test code ide ne likha to solve the error
        println(  gender2.toUpperCase())// println ko baad mei likha ai
    }

    println( gender2?.toUpperCase())// ? is save call operator

    gender2?.let {
        println("line 1")
        println("line 2 $gender2")
        println("line 3 $it")
    }
    var selectedValue = gender2 ?: "NA"// ?: is elvis operator
    var value = gender2!!.toUpperCase()// !! is non-null asserted come from ide suggestion
}