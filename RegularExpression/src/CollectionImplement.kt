import java.util.Collections
import java.util.TreeSet


    fun main(args: Array<String>) {
        val coins = arrayOf("Penny", "nickel", "dime", "Quarter", "dollar")
        val set = TreeSet<T>()

        for (i in coins.indices) set.add(coins[i])
        println(Collections.min<T>(set))
        println(Collections.min(set, String.CASE_INSENSITIVE_ORDER))

        for (i in 0..10) print('-')
        println(Collections.max<T>(set))
        println(Collections.max(set,
                String.CASE_INSENSITIVE_ORDER))
    }
