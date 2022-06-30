fun main(){
    val nome:String = "Carlos"
    val qtdLetrasNomes = nome.length
    var i = 1
    
    while(i <= qtdLetrasNomes) {
        val letra = qtdLetrasNomes - i
        print(nome[letra].uppercase())
        i = i + 1
    }
}
