fun main(args:Array<String>)
{
    val num=10101001
    conversion1(num)
}
fun conversion1(i:Int)
{
    var k=i
    var b=0.0
    var j=0
    while(k>0)
    {
        var n=k%1000
        var s=0
        when(n)
        {
            0 -> s=0
            1 -> s=1
            10 -> s=2
            11 -> s=3
            100 -> s=4
            101 -> s=5
            110 -> s=6
            111 -> s=7

        }
        b=s*Math.pow(10.0,j.toDouble())+b
        k=k/1000
        j++
    }
    println(b)
}