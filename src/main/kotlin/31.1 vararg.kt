fun main(){
    add(2,415,158,10,54,1,4821,)
    add(1,232,65,458,51,6548,321,874,6545,)
}

fun add(vararg values: Int ){
    var sum = 0
    for (i in values){
        sum += i
    }
    println(sum)
}