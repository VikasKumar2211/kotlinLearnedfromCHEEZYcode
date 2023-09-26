//Arrays, here counting start from 0
fun main(){
    var arr = arrayOf("One", "Two", "Three")
    var arr1 = arrayOf("Rishu", "Vikas", "Deepesh")// rishu is stored at 0th index, vikas at 1st index, deepesh at 2nd
    var arr2 = arrayOf<Int>(4, 5, 6)// we can specify the type explicitly, INt or String etc
    for(i in arr){
        println(i)
    }
    for ((i, e)in arr1.withIndex())//i is index and e is it's element
    {
        println("$i - $e")
    }
    println(arr[0])// we can access particular element of array, 0 is index
    println(arr2[2])
    println(arr.get(1))// another to access
    arr.set(0, "Hello")//value set kar di
    println(arr[0])
    println(arr.size)
    println(arr[3])//error will come as nothing is at 3rd position, counting starts with 0
 }