import java.util.*

fun main(){
    val cnbInput = CNBInput()
    val currency = cnbInput.getInput()
    val sc = Scanner(System.`in`)
    var user: String
    var userArr: Array<String>
    while (true) {
        user = sc.nextLine()
        user = user.replace("\\{".toRegex(), "")
        user = user.replace("TO".toRegex(), "")
        userArr = user.split("}").toTypedArray()
        try {
            val count = userArr[0].toFloat()
            val from = currency.getValue(userArr[1])
            val to = currency.getValue(userArr[2])
            println(count * from / to)
        } catch (e: Exception){
            println("neznám bohužel kurz zadané měny")
        }
    }
}