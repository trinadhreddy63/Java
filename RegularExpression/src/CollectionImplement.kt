import java.util.*

fun main(args: Array<String>) {
    val ma= mapOf<Int,String>(1 to "Monday",2 to "Tuesday",3 to "Wednesday",4 to "Thursday",5 to "Friday",6 to "Saturday",0 to "Sunday")
    println(ma.getValue(4))
    ma.plus(1 to "Sunday")
    println(ma.contains(0))
    for(i in 0..6)
        println(ma.getValue(i))
}
