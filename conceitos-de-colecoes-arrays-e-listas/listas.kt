fun main(){
    val joao = Funcionario( "João", 2000.0, "CLT")
    val pedro = Funcionario( "Pedro", 1500.0, "PJ")
    val maria = Funcionario( "Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach { println(it) }

// Procura na lista o valor Maria para a variável nome.
    println("---------------------------")
    println(funcionarios.find { it.nome == "Maria" })

// Ordena a lista A-Z.
    println("---------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

// Agrupa funcionarios pela variável tipoContratacao.
    println("---------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
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