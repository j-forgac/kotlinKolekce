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
        val count = userArr[0].toFloat()
        val from = userArr[1]
        val to = userArr[2]
        println(count * currency[from]!! / currency[to]!!)
    }
}