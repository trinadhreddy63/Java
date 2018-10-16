import java.util.*

fun main(args: Array<String>) {
    val ma= mapOf<Int,String>(1 to "Monday",2 to "Tuesday",3 to "Wednesday",4 to "Thursday",5 to "Friday",6 to "Saturday",0 to "Sunday")
    println(ma.getValue(4))
    ma.plus(1 to "Sunday")
    println(ma.contains(0))
    for(i in 0..6)
        println(ma.getValue(i))
    val l= listOf<Int>(1,2,3,5,6,9,77)
    println(l.sum())
    var k=l.sumBy { it }
    println(k)
    val m= listOf(1,2,6,7,9)
    println(l.subtract(m))

}
