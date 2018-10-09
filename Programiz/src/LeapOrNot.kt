fun main(args:Array<String>)
{
    val x=1400
    if(x%4==0 && x%100==0 && x%400!=0)
                println("given year is leap year")
    else
        println("given year is not leap year")
}