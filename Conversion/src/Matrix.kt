import java.util.*

fun determinant(AnArray: Array<IntArray>, N: Int): Int {
    var det=0
    if(N==1)
        det=AnArray[0][0]
    else if (N==2)
        det=AnArray[0][0]*AnArray[1][1]-AnArray[0][1]*AnArray[1][0]
    else
    {

    }
    return 0
}
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter number of rows")
    val a=sc.nextInt()
    println("Enter number of columns")
    val b=sc.nextInt()
    if(a==b) {
        val arr1 = Array(a) { IntArray(b) }
        for (i in 0..a - 1) {
            for (j in 0..a - 1) {
                arr1[i][j] = sc.nextInt()
            }
        }
        for (i in 0..a - 1) {
            for (j in 0..a - 1) {
                print(" " + arr1[i][j])
            }
            println()
        }
    }
    else
    {
        println("the given matrix to be an square matrix i.e. number of rows =number of columns")
        println("but you have given number of rows not equal to number of columns")
    }
}