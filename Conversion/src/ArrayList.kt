fun main(args:Array<String>) {
    val lis= listOf(1,2,"we",5.0,"sai")
    val arrayList = ArrayList<Any>()
    arrayList.add("king")
    arrayList.add("queen")
    arrayList.add("minister")
    arrayList.add(1)
    println(arrayList)
    arrayList.add(2, "Start")
    println(arrayList)
    println(arrayList.addAll(lis))
    println(arrayList)
    println(arrayList.get(4))
    println(arrayList)
    println(arrayList.indexOf(1))
    println(arrayList.lastIndexOf(1))
    arrayList.remove(2)
    println(arrayList)
    arrayList.removeAt(1)
    println(arrayList)
    arrayList.removeAll(lis)
    println(arrayList)
    arrayList.clear()
    println(arrayList.isEmpty())
    arrayList.addAll(lis)
    println(arrayList.toString())
    for(i in arrayList.toArray())
        println(i)

    }