data class recipe(val title: String,
                  val mainIngreidient: String,
                  val isVegetarian: Boolean,
                  val difficulty: String = "Easy")

class mushroom(val size: Int, val isMagic: Boolean){
    constructor(isMagic_param: Boolean) : this(0, isMagic_param){
        //second constructors calls this code
    }
}
fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = ""): Array<recipe>{
    // recipe finder
    return arrayOf(recipe(title, ingredient, isVegetarian, difficulty))
}
fun addNumbers(a: Int, b: Int): Int{
    return a + b
}
fun addNumbers(a: Double, b: Double): Double{
    return a + b
}

fun main(args: Array<String>){
    val r1 = recipe("Thai Curry", "Chicken"
    val r2 = recipe( "Thai Curry", "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash cde: ${r1.hashCode()}")
    println("r2 hash cde: ${r2.hashCode()}")
    println("r3 hash cde: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 ===r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val(title, mainIngreidient, vegetarian, difficulty) = r1
    println("the title is $title and vegetarian is $vegetarian")

    val m1 = mushroom(6, false)
    println("m1 size is ${m1.size} and is magic is ${m1.isMagic}"
    val m2 = mushroom(true)
    println("m2 size is ${m2.size} and is magic is ${m2.isMagic}")
    println()
    )

}