fun main(){
    var i = 10
    var j = 11

    var result1 = i==167 || j == 11// or laga hua hai aur j equal to 11 wali baat sach toh true answer hai
    println(result1)
    var result2 = i==453 || j++ == 11//j++ bhi 11 hi hai kyuki ye post increment hai, and also value of j++ is never used lol
    println(result2)
    println(j)// post increment hai toh value increase ho gyi
    println(j++)//value of j++ is never used lol
    print(j)
}