class Wolf{
    var hunger = 10
    val food = "meat"

    fun eat(){
        println("the wolf hunts for its $food")
    }
}
class myWolf{
    var wolf: Wolf?= Wolf()

    fun myFunction(){
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}
fun main(){
    var w: Wolf? = Wolf()

    if (w!= null){
        w.eat()
    }
    var x = w?.hunger
    println(" the value of x is $x")

    var y = w?.hunger ?: -1
    println("the value of y is $y")

    var myWolf = myWolf()
    myWolf?.wolf?.hunger = 8
    println(" the value of myWolf?.Wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi","Hello", null)
    for (item in myArray){
        item?.let { println(it)}
    }
    getAlphaWolf()?.let {it.eat()}
    w = null
    var z = w!!.hunger
}