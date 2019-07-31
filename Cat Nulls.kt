class cat(var name :String? = null){
    fun meow() { println("Nya")}
}

fun main(){
    var myCats = arrayOf(cat("Misty "), cat (null), cat("socks"))
    for(cat in myCats){
        println("${cat.name}:")
        cat.meow()
    }
}