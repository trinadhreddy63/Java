fun main(args:Array<String>)
{
    arm(196)
}
fun arm(i:Int)
{
    var k=i
    var rev=0
    while(k>0)
    {
        var n=k%10
        rev=n*n*n+rev
        k=k/10
    }
    if(i==rev)
        println("$i is Armstrong number")
    else
        println("$i is not Armstrong number")
}