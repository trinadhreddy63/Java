fun main(args:Array<String>)
{
    val first=16
    val second=22
    println("enter an operator + - * /")
    val operator=readLine()
    var result=0
    when(operator) {
        "+" -> result = first + second
        "-" -> result = first - second
        "*" -> result = first * second
        "/" ->  result = first / second
        else -> {
            println("enter the correct operator")
            return
        }
    }
    println(result)
    }