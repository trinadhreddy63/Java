fun main(args:Array<String>)
{
    val x=300
    for(i in 2..x)
    {
        var count=0
        for(j in 2..i/2)
        {
            if(i%j==0)
                count++
            else
                continue
        }
        if(count==0) {
            var z =x-i
            var count1=0
            for(n in 2..z/2)
            {
                if(z%n==0)
                    count1++
                else
                    continue
            }
            if(count1==0)
            {
                println("$i and $z")
            }
            else
                continue
        }
        else
            continue
    }
}