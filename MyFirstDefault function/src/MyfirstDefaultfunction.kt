fun main(args:Array<String>)
{
    var a:Int=area(15,20)
    var b:Int=area(15,20,30)
    var c:Int=area(13,12)
    println("$a $b $c")
    volume(length = 10,breadth = 20)
    volume(height = 20,length = 15,breadth = 16)


}
fun area(length:Int,breadth:Int,height:Int=10):Int
{
    return length*breadth*height
}
fun volume(length:Int,breadth:Int,height: Int=10)
{
    println("length is $length")
    println("breadth is $breadth")
    println("height is $height")
}