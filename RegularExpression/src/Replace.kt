import java.*
import java.time.*
import java.util.*

    fun main(args: Array<String>) {
        val list = Arrays.asList(*"one Two three Four five six one three Four".split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
        println("List :$list")
        Collections.replaceAll(list, "one", "hundred")
        println("replaceAll: $list")
        val currentZone = ZoneId.systemDefault()
        println(currentZone)
        val localDateTime = LocalDateTime.of(2016, 12, 18, 12, 34)
        println(localDateTime)
        val hereDateTime = ZonedDateTime.of(localDateTime, currentZone)
        println(hereDateTime)
        val offset = hereDateTime.getOffset()
        println(offset)
        val allZoneIds = ZoneId.getAvailableZoneIds()
        var count=1
        for(i in allZoneIds) {
            println("$count  $i")
            count++
        }
    }
