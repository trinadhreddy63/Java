import java.util.regex.Pattern

    fun main(args: Array<String>) {
        var count = 0
        val p = Pattern.compile("ab")
        val m = p.matcher("ababbababb")
        while (m.find()) {
            count++
            println("the index of start of that occurence: " + m.start() + " the (index+1) of end of that occurence: " + m.end() + " the occurence is: " + m.group())
        }
        println("the number of occurence $count")
    }

