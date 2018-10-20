fun main(args: Array<String>){
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    }
    catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    }
    catch (e: Exception) {
        println("parent exception catch")
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    }

    println("code after try catch...")
}
