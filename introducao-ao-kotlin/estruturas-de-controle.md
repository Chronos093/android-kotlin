# Estruturas de controle
>As estruturas de controle do kotlin são as if/else, when, elvis operator. Pode ser utilizado tanto para controle como para atribuição, pode ser encadeado com múltiplas estruturas mas não é recomendado.


>Exemplos:

```kotlin
// Exemplo if
if(expressão){
    //bloco de código
}else if(expressão2){
    //bloco de código
}else{
    //bloco de código
}
```
```kotlin
// Exemplo when
when{
    case1 -> {}
    case2 -> {}
    case3 -> {}
    else -> {}
}
```
```kotlin
// Exemplo elvis operator
val a:Int? = null
var number = a ?: 0
```

## Atribuição
>Quando estamos utilizando para atribuição devemos estruturar a condicional a partir de uma variável já declarada.

  - O valor atribuído tem que estar na última linha do bloco;
  - A condicional pode não usar chaves se só fizer a atribuição;


```kotlin
val maxValue = if(a > b) a else if(a < b) b else b

val minValue = if(a > b) {
    println("b($b) é o menor valor")
    b
}else if(a < b){
    println("a($a) é o menor valor")
    a
}else{
    println("Os valores são iguais")
    b
}
```

## When
>Equivalente ao switch de outras linguagens, aceita tanto valores quando condicionais, e aceita range como case.


>Exemplos:

```kotlin
when {
    a > b -> {}
    a != b && a > c -> {}
    b == 0 -> {}
    else -> {}
}
```
```kotlin
when(year) {
    -4000..475 -> //Antiguidade
    476..1452 -> //Medieval
    1453..1789 -> //Moderna
    currentYear -> //Ano atual
}
```
## Evis Operator
>O mais próximo que a linkguagem possui de um operador ternário, ele verifica se um valor é nulo e apresenta uma opção caso seja. Pode ser encadeado.


>Exemplos: 
Nesse caso, se o valor de 'a' não for nulo, 'number' recebe 'a'. Se o valor de 'a' for nulo e 'b' não for nulo, 'number' recebe 'b'. Se 'a' e 'b' forem nulos, 'number' recebe '0'.
```kotlin
val a:Int? = null
val c:Int? = 9
var number = a?: b?: 0
```

# Repetição
>As estruturas de repetição do kotlin são semelhantes as de outras linguagens, são elas while, do..while, for, e forEach. Aceita os comandos in, range, until, downTo e step.

## For
  `for('variávelIndexadora' in/until/downTo 'faixa de valores/condicional' step 'intervalo')`

   - In: conta do valor inicial até o valor final estabelecido;
   - Until: conta do valor atual até o valor estabelecido menos 1;
   - DownTo: conta de maneira decrescente;
   - Step: determina o intervalo da contagem;
  
  >Exemplos:

  ```kotlin
   fun main() {
    //default()
    //downTo()
    //until()
    //step(2)
    //letters()
  }
 
  fun default(){
    for(i in 0..20) {
        print("$i ")
    }
  }
  
  fun downTo(){
    for(i in 20 downTo 0) {
        print("$i ")
    }
  }
  
  fun until(){
    for(i in 1 until 20) {
        print("$i ")
    }
  }
  
  fun step(num:Int){
    for(i in 0..20 step num) {
        print("$i ")
    }
  }

  fun letters(){
    val sArray = "Olha essa string!"
    //tamanho do array
    //cada posição do array
    for(l in sArray){
        //l[index]
        println(l.toUpperCase())
    }
  }
  ```