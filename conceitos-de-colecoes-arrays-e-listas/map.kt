// Mapa é uma coleção de chaves e seus valores, utilizamos um exemplo
//de pair onde cada pair tem seu valores.

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
// Retorna Chave: João - Valor: 1000.0
// 
println("---------------------------")
    val map2 = mapOf(
        "Pedro" to 2500.0, // Decaração de chave e seu valor.
        "Maria" to 3000.0
        )

    map2.forEach { (k, v) -> println("Chave: $k - Valor $v") }
// Retorna Chave: Pedro - Valor 2500.0
//         Chave: Maria - Valor 3000.0
}
