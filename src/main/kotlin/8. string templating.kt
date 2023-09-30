fun main() {


    println("String Templating")
    var number = 8.5654532165
    for(i in 1..45 step 1)
    {
        // println(number.toString() + " x " + i + " = " + (number * i)) //concatination
        // number ko string mei convert karna hoga toString laga kar
        println("$number x $i = ${number*i}") // string templating

    }}