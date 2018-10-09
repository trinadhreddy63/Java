fun main(args:Array<String>)
{
    factors(120)
}
fun factors(i:Int)
{
    println("the factors of $i is")
    for(k in 2..i)
    {
        if(i%k==0)
            println(k)
        else
            continue
    }
}