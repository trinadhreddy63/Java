fun main(args:Array<String>)
{
    val num=10101001
    conversion(num)

}
fun conversion(i:Int)
{
    var k=0.0
    var m=i
    var j=0
    while(m>0)
    {
     var n=m%10
     k=k+n*Math.pow(2.0, j.toDouble())
     m=m/10
        j++
    }
 println(k)
}