fun main(){
    val joao = Funcionario( "João", 2000.0, "CLT" )
    val pedro = Funcionario( "Pedro", 1500.0, "PJ" )
    val maria = Funcionario( "Maria", 4000.0, "CLT" )

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

// Adiciona pedro a Lista
    println("--------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

// Remove jao da Lista
    println("--------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-------- SET --------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("--------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("--------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
    """
        Nome: $nome
        Salário: $salario
    """.trimIndent()
    
}