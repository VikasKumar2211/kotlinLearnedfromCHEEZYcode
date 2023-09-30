fun main(){
    for(i in 1..5 step 2)
    {
        println(i)
    }

    println("for loop with Until")
    for(i in 1 until 5)//1, 2, 3, 4
    {
        println(i)
    }

    println("for loop with downTo")
    for(i in 10 downTo 1)
    {
        println(i)
    }
    println("for loop with downTo with step")
    for(i in 10 downTo 1 step 2)
    {
        println(i)
    }
}