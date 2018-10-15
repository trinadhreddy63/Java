import java.util.*
fun main(args: Array<String>) {
    val list = Arrays.asList(*"one Two three Four five six".split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
    println("List :$list")
    for(i in 1..list.size) {
        Collections.rotate(list, 1)
        println("rotate: $list")
    }
}
