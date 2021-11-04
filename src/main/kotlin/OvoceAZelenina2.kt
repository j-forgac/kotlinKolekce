import java.util.*

var fruitAndVegetable = arrayListOf<String>()
val sc = Scanner(System.`in`)

fun main() {
    println("zadejte počet zeleniny")
    val n = sc.nextInt()
    getInput("zeleninu", n)
    println("zadejte počet ovoce")
    val m = sc.nextInt()
    getInput("ovoce", m)
    println("zadavejte ovoce nebo zeleninu")
    while (true){
        val plant = sc.nextLine()
        if(fruitAndVegetable.contains(plant))
            if(fruitAndVegetable.indexOf(plant) < n) println("zelenina") else println("ovoce")
        else println("ostatní")
    }
}

fun getInput(food: String, count: Int) {
    var x = 0
    while (x < count) {
        println("zadejte $x. $food")
        val buffer = sc.nextLine()
        val plant = sc.nextLine()
        if (!fruitAndVegetable.contains(plant)) {
            fruitAndVegetable.add(plant)
            x++
        }else{
            println("pozor duplicita!")
        }
    }
}