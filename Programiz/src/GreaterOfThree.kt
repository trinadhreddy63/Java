fun main(args:Array<String>)
{
    var a=20
    val b=120
    val c=99
    when
    {
        (a>b)&&(a>c) -> println("$a is a greatest among three")
        (b>a)&&(b>c) -> println("$b is a greatest among three")
        else -> println("$c is a greatest among three")
    }
}