fun main(){
    val altura:Double = 1.87
    val peso:Double = 89.5
    
    val imc:Double = peso / (altura * altura)
    
    if (imc < 18.5){
        println("Você está com, Magreza")
    }else if (imc < 24.9){
        println("Você está com, Normal")
    }else if (imc < 29.9){
        println("Você está com, Sobrepeso")
    }else if (imc < 34.9){
        println("Você está com, Obesidade grau I")
    }else if (imc < 39.9){
        println("Você está com, Obesidade grau II")
    }else if (imc < 40){
        println("Você está com, Obesidade grau III")
    }else {
        println("Erro ao calcular o IMC.")
    }
}
