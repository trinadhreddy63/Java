

fun main(args: Array<String>) {
    var list1: List<Any> = listOf("sachin", "anil", "vijay", "sachin", 1, 2, 3)
    println(list1)
    for (element in list1)
        println(element)
    var list2: List<String> = listOf("sachin", "vijay")
    println(list1.indexOf("sachin"))
    println(list1.lastIndexOf("sachin"))
    println(list1.contains(2))
    println(list1.containsAll(list2))
    println(list1.size)
    println(list2.size)
    println(list1.subList(2, 5))
    println(list1.drop(1))
    println(list1.dropLast(2))
    println(list1.get(2))
    println(list1.isEmpty())
    println(list1.listIterator())
    var listReturn:ListIterator<Any> = list1.listIterator(1)
    for (i in listReturn  )
        print(" $i")
    println()
    var listReturn1:ListIterator<Any> = list1.listIterator()
    for (i in listReturn1  )
        println(" $i")
    var set1:Set<Any> = setOf(1,2,3)
    var set2:Set<Any> = setOf(2,3,1)
    var b:Boolean=if(set1==set2)
                    true
                else
                    false
    println(b)
    var list3:List<Any> = listOf(1,2,3)
    var list4:List<Any> = listOf(2,3,1)
    var c:Boolean=if(list3==list4)
        true
    else
        false
    println(c)
    val max = listOf(1, 42, 4).max()
    println(max)
    val kit= listOf("a","b","ccc","ddd","eeee").maxBy { it.length }
    println(kit)
    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive,negative) = numbers.partition { it > 0 }
    println(positive)
}