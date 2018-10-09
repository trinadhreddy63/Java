fun main(args:Array<String>)
{
    var i=101
    var k=i
    var rev=0
    while(k>0)
    {
        var n=k%10
        rev=n+rev*10
        k=k/10
    }
    if(i==rev)
        println("given number is palindrome")
    else
        println("given number is not palindrome")
}