fun main(args:Array<String>)
{
    var i=1
    var j=0
    for(n in 1..10) {
        println(i)
        var k = i
        i = j + i
        j = k
    }
}