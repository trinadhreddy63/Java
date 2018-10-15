import java.*
import java.util.*

    fun main(args: Array<String>) {
        val list = Arrays.asList(*"one Two three Four five six one three Four".split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
        println("List :$list")
        Collections.replaceAll(list, "one", "hundread")
        println("replaceAll: $list")
    }
