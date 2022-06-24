fun main() {
    val joao = Funcionario( "João", 2000.0, "CLT")
    val pedro = Funcionario( "Pedro", 1500.0, "PJ")
    val maria = Funcionario( "Maria", 4000.0, "CLT")

// Dois conjuntos, funcionarios.
    val funcionarios1 = setOf(joao, maria)
    val funcionarios2 = setOf(maria)

// União dos conjuntos de Funcionarios.
    val resultUnion =  funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

// Retira o que tem de comum entre os dois conjuntos informados.
    println("----------------------")
    val funcionarios3 = setOf(joao, maria, pedro)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

// Retorna apenas oque é comum entre os conjuntos.
    println("----------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
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