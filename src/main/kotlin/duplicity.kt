import java.util.*

fun main (){
    val sc = Scanner(System.`in`);
    val arr: ArrayList<Int> = ArrayList()
    while(sc.hasNext()){
        arr.add(sc.nextInt())
    }
    var count = 0
    val unique: Set<Int> = arr.toSet()
    println("${unique.size}\n-----")
    for(x in arr.indices){
        println(arr[x])
    }
}