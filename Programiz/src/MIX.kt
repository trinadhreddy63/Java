fun main(args: Array<String>) {
    //courses with price
    val java=Course("Java",1500.0)
    val c=Course("C-Language",500.0)
    val cplus=Course("C++",600.0)
    val kotlin=Course("Kotlin",1200.0)
    val python=Course("Python",2000.0)
    val html=Course("HTML",100.0)
    val css=Course("CSS",100.0)
    val javascript=Course("JavaScript",200.0)
    val dotnet=Course(".NET",1500.0)
    val sql=Course("Oracle SQL",700.0)
    val testing=Course("Testing tools",1000.0)
    val spring=Course("Java Spring",800.0)
//names
    val sai = "Sai"
    val chaitanya = "Chaitanya"
    val abhisekh = "Abhisekh"
    val aditya = "Aditya"
    val trinadh = "trinadh"
//states
    val andhra = State("andhra")
    val telengana = State("telengana")
    val tamilnadu = State("tamilnadu")
    val karanataka = State("karnataka")
//capitals
    val andhracapital = Capital("amaravati")
    val telenganacapital = Capital("hydreabad")
    val tamilnaducapital = Capital("Chennai")
    val karnatakacapital = Capital("bangalore")
    fun training(vararg courses: Course,isCompleted:Boolean)=Training(courses.toList(),isCompleted)
    fun person(name: String, state: State, capital: Capital) = Person(name, state, capital)
    fun subject(name: String, vararg persons: Person) = Subject(name, persons.toList())
    val subject1 = subject("Computer languges", person(trinadh, andhra, andhracapital), person(chaitanya, telengana, telenganacapital))
    val persons: Map<String, Person> = subject1.persons.fold(hashMapOf(), { map, person ->
        map[person.name] = person
        map
    })
    val groupedByStates= mapOf(andhra to listOf(trinadh),telengana to listOf(chaitanya))
    val trainCourse=setOf(java,c,cplus,python,spring,html)

}