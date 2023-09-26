fun main (){
    val nums = listOf(3,4453.223, 45.8, 32)
    println(nums.indexOf(32))
    println(nums.contains(6.9))
    println(nums.contains(45.8))
    //nums[1]=2// it wont work as well, reason below
    //nums.add(978)// it won't work as normal list is immutable
    val nums1 = mutableListOf(125, 21.4, 5, 9)
    println("Outputs of mutable List nums1")
    println(nums1.indexOf(9))
    println(nums1.contains(9))
    nums1[3]=22// upar wala true hi rahega, kyuki change baad mei hoga as code excute in sequence
    println(nums1)
    nums1.remove(125)
    println(nums1)

    nums1.addAll(nums)
    println(nums1  )

}