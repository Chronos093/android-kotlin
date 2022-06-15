# Valor nulo e Operadores aritméticos básicos
>No kotlin qualquer tipo pode ser nulo, mas deve ser explicitado na declaração da variável. Para atribuir para uma variável o nulo utiliza a interrogação '?'.
Exemplo:


  `var month:Int? = null`


  ## Operadores Aritméticos

  Função        | Expressão | Comando   | Atribuição
  --------------|-----------|-----------|-----------
  soma          | a + b     | a.plus(b) | a += b
  subtração     | a - b     | a.minus(b)| a -= b
  multiplicação | a * b     | a.times(b)| a *= b
  divisão       | a / b     | a.div(b)  | a /= b
  resto         | a % b     | a.mod(b)  | a %= b


>Exemplo:
```kotlin
// Soma
fun main(){
  val count = 10
  val times = 9
  val resul = times +count

  println(resul)
  println(count.plus(times))
}
```
>Concatenar texto:
```kotlin
// Concatenar texto
fun main(){
  var txtUm = "Olá, "
  var txtDois = "Mundo!"

  println(txtUm + txtDois)
}
```
## Operadores comparativos
Função            | Expressão     | Comando
------------------|---------------|-------------
maior/menor       | a>b ou a<b    | a.compareTo(b)>0 ou a.compareTo(b)<0
maior/menor igual | a>=b ou a<=b  | a.compareTo(b)>=0 ou a.compareTo(b)=<0
igual             | a == b        | a.equals(b)
diferente         | a != b        | !(a.equals(b))

>Os comandos retornam um inteiro na faixa de -1 a 1, onde se o valor for maior retorna 1, e for menor retorna -1, e se for igual retorna 0. Agora as expressões retornam um booleano assim como o 'equals()' que também retorna um booleano, ou seja true ou false. Exemplos:

```kotlin
fun main(){
  val d = 22
  val t = 90

  println(d > t)
  // Retorna false
  println(d.compareTo(t))
  // Retorna -1
}
```
>Para que ambos retorne um valor booleano podemos fazer da seguinte forma.
```kotlin
const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main(){
  val d = 22
  val t = 90

  println(d > t)
  // Retorna false
  println(d.compareTo(t) == MORE)
  // Retorna false
}
```
>Outros exemplos:
```kotlin
// Maior ou Igual
const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main(){
  val d = 220
  val t = 219

  println(d >= t)
  // Retorna true
  println(d.compareTo(t) >= EQUAL)
  // Retorna true
}
```
```kotlin
// Igual
const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main(){
  val d = 220
  val t = d

  println(d == t)
  // Retorna true
  println(d.equals(t))
  // Retorna true
}
```
```kotlin
// Diferente
const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main(){
  val d = 220
  val t = d

  println(d != t)
  // Retorna false
  println(!d.equals(t))
  // Retorna false
}
```

## Operadores Lógicos
Função e Expressão | Comando
-------------------|--------------------
E (&&)             | (expressão1) and (expressão2)
OU (||)            | (expressão1) or (expressão2)

>Quando utilizar o comando é recomendado colocar a expressão entre parênteses;

### Operadores in e range
>O in verifica se um número/valor está presente em uma lista. Range cria um número aleatório entre dois paramêtros passados.


>Exemplo:
```kotlin
fun main(){
  val bingo = listOf(8,6,34,2,13)
  val number = (1..34).random()

  println(number)
  println(number in bingo)
}
```
```kotlin
const val MIN_AGE = 16
const val MAX_AGE = 68

fun main(){
  var age = (10..100).random()
  println(age)
  println(age in MIN_AGE..MAX_AGE)
  println(age >= MIN_AGE && age <= MAX_AGE)
}
```