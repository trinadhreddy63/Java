fun main(args:Array<String>)
{
    val a=25
    val b=35
    if(a>=b)
    {
        var c=b
        for(i in 1..1000)
        {
            if(a%c==0)
            {
                println("the gcd of given number=$c")
                break
            }
            else
                c=a%c
        }
    }
     else
    {
        var c=a
        for(i in 1..1000)
        {
            if(b%c==0)
            {
                println("the gcd of given number=$c")
                break
            }
            else
                c=b%c
        }
    }
}