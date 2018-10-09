fun main(args:Array<String>)
{
    val result = listOf(1, 2, 3, 4).fold(1, { partResult, element -> element * partResult })
    println(result)
}