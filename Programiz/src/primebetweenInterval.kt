fun main(args:Array<String>)
{
    val i=14
    val b=770
    for(k in i..b)
    {
        var count=0
        for(j in 2..k/2)
        {
            if(k%j==0)
                count++
            else
                continue
        }
        if(count==0)
            println(" $k is an prime number")
        else
            println("$k is not prime number")
    }
}