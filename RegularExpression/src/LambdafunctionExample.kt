fun main(args: Array<String>){
    val myLambda: (Int) -> Unit= {s: Int -> println(s) }
    addNumber(5,10,myLambda)
}
fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){
    val add = a + b
    mylambda(add)   
}