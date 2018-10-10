fun main(args: Array<String>) {


    val c = PatternMatching::class
    val c1 = String::class
    println(c)
    println(c1)
    val number = listOf(-10,-5,0,5,10)
    val strings = listOf("kotlin", "program")
    println(number.filter(::isPositive))
    println(strings.filter(::isPositive))
    println(::x.get())
    println(::x.name)
    println(::y.set(10))

}
var x=5
var y=5
fun isPositive(x: Int) = x> 0
fun isPositive(s: String) = s== "kotlin" || s == "Kotlin"