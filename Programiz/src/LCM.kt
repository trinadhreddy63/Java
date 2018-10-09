fun main(args:Array<String>)
{
    val a=15
    val b=18
    var lcm=if(a>b) a else b
    while(true)
    {
        if(lcm%a==0 && lcm%b==0) {
            println("lcm of given number is $lcm")
            break
        }
        else
            ++lcm
    }

}