import java.util.*
fun main(args: Array<String>) {
    val letters = ('a'..'f').toList()
    val pairs = letters.zipWithNext()

    println(letters)
    println(pairs)
    val listA = listOf("a", "b", "c")
    val listB = listOf(1, 2, 3, 4)
    println(listA zip listB)
    val result = listA.zip(listB) { a, b -> "$a$b" }
    println(result)
    val iterator = ('a'..'c').iterator()
    for ((index, value) in iterator.withIndex()) {
        println("The element at $index is $value")
    }
    val sequence = generateSequence(1) { it + 1 }

    val windows = sequence.windowed(size = 5, step = 1)
    println(windows.take(4).toList())

    val moreSparseWindows = sequence.windowed(size = 5, step = 3)
    println(moreSparseWindows.take(4).toList())

    val fullWindows = sequence.take(10).windowed(size = 5, step = 3)
    println(fullWindows.toList())

    val partialWindows = sequence.take(10).windowed(size = 5, step = 3, partialWindows = true)
    println(partialWindows.toList())
    val dataPoints = sequenceOf(10, 15, 18, 25, 19, 21, 14, 8, 5)

    val averaged = dataPoints.windowed(size = 4, step = 1, partialWindows = true) { window -> window.average() }
    println(averaged.toList())

    val averagedNoPartialWindows = dataPoints.windowed(size = 4, step = 1).map { it.average() }
    println(averagedNoPartialWindows.toList())
}