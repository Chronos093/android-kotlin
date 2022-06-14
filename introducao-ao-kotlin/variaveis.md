# VARIÁVEIS
## Declaração de variável
>Para declarar uma variável utilizamos a declaração 'var' para declarar variáveis e 'val' para constantes. Para nomear variaveis utiliza palavras sem espaços com a primeira letra minúscula e as demais primeiras letras das demais palavras sera maiúscula, exm: primeiroNome. Ainda existe a variável 'const val', cujo valor é atribuido durante a compilação do código e não pode ser alterado somente consultado. Exemplos:

```kotlin
// Declara somente a variável
var currentAge = 22

// Declara o tipo de variável e depois a variável
var currentAge:Int?
currentAge = null ou 22

// Declara somente a variável
val currentAge = 22

// Declara o tipo de variável e depois a variável
val currentAge:Int?
currentAge = null ou 22

const val MIN_AGE = 16
const val MAX_AGE = 68
```
>Exemplo declaração de um 'const val'

```kotlin
const val MAX_AGE = 68
// função principal
fun main(){
    var currentAge:Int
    currentAge = 90

    println(currentAge > MAX_AGE)
}
```
>Ele deve retornar, 'true'


## Possíveis erros
```kotlin
var currentAge
currentAge = 22 //ERRO!

var currentYear = "Ano"
currentYear = 2022 //ERRO!
```

>No primeiro caso o erro ocorre pois não foi declarado o tipo de dado/atribuição, para corrigir pode-se codar da seguinte forma.


```kotlin
// Primeira opção
fun main(){
    var currentAge = 22
    println(currentAge)
}
```
```kotlin
// Segunda opçã0
fun main(){
    var currentAge:Int
    currentAge = 22

    println(currentAge)
}
```


>No segundo caso de erro ocorreu pois primeiro a variável foi declarado como string e depois tentou atribuir um valor tipo Int, para corrigir pode se alterar a variável na declaração para Int, ou converter a variável para Int. Exemplo:


```kotlin
// Primeira opção
fun main(){
    var currentYear:Int
    currentYear = 2021

    println(currentYear)
}

// Segunda opção
fun main(){
    var currentYear = "Ano"
    currentYear = 2022.toString()

    println(currentYear)
}
```