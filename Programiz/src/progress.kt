data class Capital(val name:String){
    override fun toString() = "$name"
    }
data class State(val name: String){
    override fun toString() ="$name"
}
data class Training(val courses: List<Course>,val isCompleted:Boolean)
data class Person(val name:String, val state: State, val capital: Capital)
{
    override fun toString() = "$name from ${state.name} whose capital city is ${capital.name}"
}
data class Subject(val name: String,val persons:List< Person>)
data class Course(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}