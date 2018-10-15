import java.util.*
    fun main(args: Array<String>) {
        val list = Arrays.asList(*"one Two three Four five six".split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
        println("List :$list")
        for(i in 1..list.size) {
            Collections.rotate(list, 1)
            println("rotate: $list")
        }
    }

/*
    sun()


    fun foo(name: String="",number:Int=42,toUpperCase:Boolean=false): String {
        if (toUpperCase) {
            var name1 = name.toUpperCase() + number.toString()
            return name1
        } else
            return name + number.toString()
    }

    fun sun() {
        val fa= (foo("a") +
                foo("b", number = 1) +
                foo("c", toUpperCase = true) +
                foo(name = "d", number = 2, toUpperCase = true))
        println("$fa")

    }

       var string:String?=null
       val current=LocalDateTime.now()
       val current1=LocalDateTime.now()
       //val zonedDate=current.atZone()
       val current3=LocalDateTime.now(ZoneId.of("Europe/Berlin"))

       println(current)
       println(current1)
       val s= current < current1
       println(s)
       var count=1
       var current2=LocalDateTime.of(2018,12,8,0,0,0)
       var current4=LocalDateTime.of(2019,2,8,0,0,0)
       var current5=LocalDateTime.of(2019,1,5,0,0,0)
       while(current2<current4.plusDays(1)) {
           if (current2.isEqual(current5)) {
               println(current2)
               break
           } else {
               current2 = current2.plusDays(1)
               println(count)
               count++
               continue
           }
           }
       var i = 1
       while (i < 10) {
           println(i)
           i = i * 2
       }
       val result = if (1 < 2) 1 else 2
       println(result)
       val a=10.toString()
       val b=10.toString()
       println(a==b)
       println(a===b)

       var birthday = LocalDate.of(1994,10,5)
         //  println(birthday.plusDays((birthday.year+birthday.w)))*/

