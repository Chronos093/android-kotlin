fun main(){
    val number1:Int = 12
    val number2:Int = 12
    
    val operation:String = "soma"	
    
    when(operation){
        "soma" -> soma(number1, number2)
        "subt" -> subt(number1, number2)
        "mult" -> mult(number1, number2)
        "divi" -> divi(number1, number2)
    }
    
}

fun soma(number1:Int, number2:Int){
    val result:Int = number1 + number2
    println("O resultado é, $result")
}

fun subt(number1:Int, number2:Int){
    val result:Int = number1 - number2
    println("O resultado é, $result")
}

fun mult(number1:Int, number2:Int){
    val result:Int = number1 * number2
    println("O resultado é, $result")
}

fun divi(number1:Int, number2:Int){
    val result:Int = number1/number2
    println("O resultado é, $result")
}
