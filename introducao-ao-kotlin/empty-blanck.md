# Empty x Blank
>Métodos de comparação, empty está vazia e blank está em branco. Empty é quando o tamanho da string é zero, blank quando uma string possuí algum espaço em branco. Exemplo:

```kotlin
fun main(){
    // Essa variável está Empty, seu tamanho é zero. Mas também está Blank pois não possui valor nela
    val s = ""

    println(s.isEmpty())
    // Retorna true
    println(s.isBlank())
    // Retorna true 
}
```
>Quando uma variável possuí apenas espaços nela ela está Blank, pois está em branco. Mas não está Empty pois o seu tamanho é maior que zero.Exemplo:

```kotlin
fun main(){
    val s = "     "

    println(s.isEmpty())
    // Retorna false
    println(s.isBlank())
    // Retorna true
}
```