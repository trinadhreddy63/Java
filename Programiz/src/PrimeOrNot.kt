fun main(args:Array<String>)
{
    val j=17
    var count=0
    for(i in 2..j/2)
    {
        if(j%i==0)
            count++
        else
            continue
    }
    if(count==0)
        println("given number is prime")
    else
        println("Given number is not prime")

}