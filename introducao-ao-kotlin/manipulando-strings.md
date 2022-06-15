# Manipulação de Strings
>Strings possuem diversos métodos associados, indexação, concatenação, comparação, e formatação. Pode ser concatenada com plus/+ e também é tratada como um array de Char.


>Tratando a string como array de Char podemos obter como retorno cada letra da palavra como parte de um array, para isso usa os comando 'First()', 'last()', 'string.length', 'string[index]'. Exemplos:


**Importante: Um array inicia pela posição 0 (zero), por isso se uma palavra tem 20 letras se considera 20-1, já que de 0~19 temos 20 posições.**

```kotlin
fun main(){
    val s = "Olá, mundo!"

    println(s.first())
    println(s.last())
    //string[index]
    println(s[0])
    //string.length
    println(s.length-1)
}
```

## Concatenação
>Para concatenar strings podemos utilizar o +, contudo ele não trata a variável ela simplismente junta as duas. A melhor maneira de se concatenar seria inserir a variável dentro de uma string, segue exemplo.


 ```kotlin
 fun main(){
    val name = "Ana"
    val s = "Olá"

    // Imprime OláAna
    println(s + name)
    // Olá, Ana!
    println("${s}, ${name}!")
    // Imprime Bem vinda(o), Ana!
    println("Bem vinda(o), ${name}!")
 }
 ```

 ## Formatação
 Nome | Função | Métodos
 -----|--------|---------
 Capitalização de strings | Alterar a formatação entre letras minúsculas e maiúscula | capitalize(), toUpperCase(), toLowerCase(), and decapitalize()
 Remoção de espaços | Remove espaços vazios e caracteres inadequados para impressão | trimEnd(), trimStart(). trim()
 Substituição de caracteres | Substituir caracteres por outras | replace(x, y)
 Formatação | Formatar outros valores para um padrão de string | "padrão ${valor}".format(valor)