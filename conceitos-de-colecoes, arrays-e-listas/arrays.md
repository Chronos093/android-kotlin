# Arrays no kotlin
```kotlin
fun main() {
// Exemplo 1 - Array de Int
   val numbers = intArrayOf(1,2,3,4,5)
   
   for(i in numbers){
       print("$i ")
   }
   
   println("")
   println("--------------------------")
   
// Exemplo 2 - Array de String
   val names2= Array(5){""}
   names[0] = "Carlos"
   names[1] = "Priscila"
   names[2] = "Lucas"
   names[3] = "Luiza"
   names[4] = "Lunna"
    
   for(name in names){ println(name) }
   
   println("--------------------------")
   
   names.sort()
   names.forEach { println(it) }
   
   println("--------------------------")
   
// Exemplo 3 - Array de String   
   val names2 = arrayOf("Carlos", "Priscila", "Lucas", "Luiza", "Lunna")
   names2.sort()
   names2.forEach { println(it) }
}
```

## DoubleArray
```kotlin
fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }
    println("-------------------------")
// Digamos que seja necessario um almento nos salarios podemos utilzar a seguinte forma para alterar os valores seguintos seus indices
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
}
```

```kotlin
fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4040.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-----------------")
    println("Maior salario: ${salarios.maxOrNull()}")// maxOrNull() retorna o maior valor da array
    println("Menor salario: ${salarios.minOrNull()}")// minOrNull() retorna o menor valor da array   
    println("Media salario: ${salarios.average()}") // average() retorna a media dos valores da array
    println("-----------------")
    val  salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    // 'filter' faz um filtro dentro do array buscando os valores que forem validados pela expressão { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }
}
}
```

