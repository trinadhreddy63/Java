import com.next.Person

fun main(args:Array<String>)
{
    var p= Person()
    val k=24;
    println("My name is ${p.name}")
    print("My age is ${p.age(k)}")
}