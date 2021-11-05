import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)
    val nums: ArrayList<Int> = ArrayList()
    while (sc.hasNext()){
        nums.add(sc.nextInt())
    }
    var avg = 0.0f
    for(x in 0 until nums.size){
        avg += nums[x]
    }
    avg /= nums.size
    var sum = 0
    for(x in 0 until nums.size){
        if(nums[x]>=avg){
            sum += nums[x]
        }
    }
    println(sum)
}
