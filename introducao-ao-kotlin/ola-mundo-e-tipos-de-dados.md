# Olá mundo e Tipos de dados

>Para codar o kotlin possui uma ferramenta gratuita e online chamada Kotlin Playground [acessa aqui.](https://play.kotlinlang.org/)


>Exemplo Hello, world:

  ```kotlin
  fun main() {
    println("Hello, world!!")
  }
  ```

## Tipos de dados
   - Int
   - Float
   - Long
   - Double
   - Array
   - Boolean
   - Char
   - Byte
   - Short
   - Null!

>Kotlin possui constantes que possibilida consultar o valor máximo de um tipo, Exm: Int.MAX_VALUE.


```kotlin
fun main(){
    println(Int.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
}
```

>Para converter dados no Kotlin usamos a 'toByte()', Exemplo:
1. toByte()
2. toShort()
3. toInt()
4. toLong()
5. toFloat()
6. toDouble()
7. toChar()

```kotlin
fun main(){
    val n = 5
    n.toByte()
}
```