fun main(args:Array<String>)
{
    val a=1
    val b=2
    val c=1
    val determinant=b*b-4*a*c
    if(determinant>0)
    {
        val root1=(-b+Math.sqrt(determinant.toDouble()))/(2*a)
        val root2=(-b+Math.sqrt(determinant.toDouble()))/(2*a)
        println("the root1=$root1 and root2=$root2")
    }
    else if(determinant==0)
    {
        val root=-b/2*a
        println("the root1=root2= $root")
    }
    else
    {
        val real=-b/2*a
        val imaginary=Math.sqrt(-determinant.toDouble())/2*a
        println("the root1=$real+j$imaginary and the root2=$real-j$imaginary")
    }
}