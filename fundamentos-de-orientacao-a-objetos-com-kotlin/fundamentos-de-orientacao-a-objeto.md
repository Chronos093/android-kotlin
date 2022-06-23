# Classe
>Uma classe é um bloco de construção de software fundamental, encontrado na grande maioria das linguagens orientadas a obketos e, dessa forma, também presente em kotlin. Elas são usadas para criar novos tipos de dados, utilizando uma estrutura composta por métodos e variáveis que podem  possuir os seus próprios tipos.

![classe](classes.png)

## Declaração de classes
>Em kotlin, um arquivo pode conter diferentes declarações de classes, as quais são feitas utilizando a palavra reservada 'class'. Abaixo está uma declaração de uma class no kotlin da forma mais simples possível.

`class Medicamento`

>No exemplo como a classe Medicamento não possui um corpo, podemos omitir as chaves que estariam na frente do seu nome.


## Construtores
>Um construtor pe uma função especial da classe, utilizada na criação e inicialização dos objetos derivados dela. Kotlin distingue os construtores de uma classe entre primários e secundários. O construtor primário de uma classe faz parte do seu cabeçalho e pode conter apenas uma lista de parâmetros, assim como apresentado abaixo.

`class Medicamento(val formula: String, val posologia: String)`

>Dado que o construtor primário não pode conter nenhum código, uma classe pode conter uma ou mais blocos de inicialização, que são excutados na ordem como são declarados no corpo da mesma. Nesses blocos de inicialização, conforme visto, podemos acessar quaisquer parâmetros que estejam presentes no contrutor primário.

```kotlin
class Medicamento(val formula: String, val posologia: String) {
     init {
         require(formula.trim().length > 0) {
            "Informe uma fórmula"
         }

         require(posologia.trim().length > 0) {
            "Informe uma posologia"
         }
     }
}
```

>Além do construtor primário, uma classe também pode declarar um ou mais construtores secundários. Esses, por sua vez, sempre devem utilizar a palvra reservada 'constructor' em suas declarações, mesmo quando um modificador de acesso for omitido ou nenhuma anotação for utilizada. Exemplo:

```kotlin
class Medicamento{
    constructor(formula: String, posologia: String)
}
```

>No caso de uma classe possuir mais de um construtor, sendo um deles primário, cada construtor secundário deve delegar ao construtor primário. Quando ambos os construtores estiverem na mesma classe, a delegação de um construtor para o outro é feita com a palavra reservada 'this'.


>Podemos utilizar valores padrão do construtor delegado de uma classe. Para demonstrar isso vamos adicionar um terceiro parâmetro no construtor para a contraindeicação do medicamento. Considerando que a  classe Medicamento possa ser inicializada sem um valor para essa propriedade, caso no qual o mesmo passará a ser uma mensagem padrão, poderíamos modelá-la da seguinte forma.

```kotlin
class Medicamento(val formula: String, posologia: String, val contraindicacao: String) {

     constructor(formula: String, posologia: String): this(formula, posologia,
          "Este medicamento não é indicado para pessoas alérgicas a $formula")
}
```

>Dessa forma, na declarção do construtor `this(formula, posologia, "Este medicamento não é indicado para pessoas alérgicas a $formula")` informamos um valor padrão para a propriedade 'contraindicacao' e assim a classe poderá ser instanciada com ou sem esse terceiro parâmetro. Exemplo:

```kotlin
val medicamento1 = Medicamento("C8H9NO2", "...")
val medicamento2 = Medicamento("C8H9NO2", "...", "Minha contraindicação")
```

>No exemplo, o objeto 'medicamento1' será iniciado com o valor padrão para a propriedade 'contraindicacao', que é "Este medicamento não é indicado para pessoas alérgicas a $formula". Para o objeto 'medicamento2', o valor da propriedade 'contraindicacao' será aquele informado no construtor, que é "Minha contraindicação".

## Construtores e propriedades
>O construtor primário age de forma diferente do construtor secundário quando a geração de propriedades para a classe na qual eles são declarados. Essa abordagem impede que as propriedades de uma classe variem de acordo com os parâmetros declarados nos construtores, uma vez que a  geração de propriedades é limitada ao construtor primário de uma classe. Exemplo:


```kotlin
class Medicamento {
    constructor(formula: String, posologia: String)
}
```

>Diferente do construtor primário, os parâmetros do construtor secundário não gerarão propriedades, visto que ao tentar executar um código como o proximo exemplo, será gerado um erro de compilação.

```kotlin
val medicamento: Medicamento = Medicamento("", "")
medicamento.formula

//Error:(10, 17) Kotlin: Unresolved reference: formula
```

>Sendo assim, nesse caso é obrigatório declarar uma propriedade na classe Medicamento, a qual poderá receber o valor do parâmetro do construtor e ser acessada a partir de uma instância, como visto acima. Podemos eliminar o erro ao acessar a propriedade 'formula', conforme o exemplo.

```kotlin
class Medicamento {
     val formula: String

     constructor(formula: String, posologia: String) {
        this.formula = formula
     }
}
```

>Assim, uma classe em kotlin pode possuir propriedades declaradas em seu corpo explicitamente. Essas propriedades podem ser mutáveis, quando declaradas coma palavra reservada 'var', ou somente leitura, quando declaradas com a palavra reservada 'val'. Caso elas sejam declaradas imutáveis, será necessário inicializá-las, o que pode ser feito no construtor secundário da classe, como no exemplo acima.


## Imutabilidade dos parâmetros dos construtores secundários
>Conforme demonstrado anteriormente, os parâmetros dos construtor secundário são declarados sem utilizar as palavras reservadas 'val' ou 'var', como nesse exemplo:
```kotlin
class Medicamento {
    constructor(formula: String, posologia: String)
}
```
>Caso uma tentativa de fazer o contrário seja feita, digamos declarando a fórmula como `val formula: String`, um erro de compilação será emitido com a seguinte mensagem apresentada.

`Kotlin: 'val' on secondary constructor parameter is not allowed`

>Em kotlin, tanto os parâmetros de funções quanto os de construtores são imutáveis por definiçaõ, o que elimina a necessidade de se utilizar 'val' ou 'var' nesse caso. A utilização de 'val' ou 'var' em construtores é restrita ao construtor primário de uma classe para definir a mutabilidade das suas propriedades, será imutável ou não, dado que apenas ele pode gerar propriedades para uma classe.


>Por exemplo, digamos que a fórmula de um medicamento nunca possa alterada, uma vez que seja definida no momento da criação de uma instância, mas que a sua posologia depende de uma regra externa a essa classe. Dessa forma, podemos modelar a classe Medicamento conforme apresentado a seguir:

`class Medicamento(val formula: String, var posologia: String)`

>Tendo sido o parâmetro formula declarado imutável, a propriedade homônima da classe Medicamento também será somente leitura. Ao tentar atribuir valor a ela a partir de uma instância o seguinte erro será apresentado:

`Error:(8, 5) Kotlin: Val cannot be reassigned`

>O mesmo erro não ocorrerá ao atribuir valor a propriedade posologia a partir de uma instância da classe Medicamento, uma vez que o parâmetro posologia, presente no construtor primário, foi declarado mutável.

## Instanciando uma classe
>Para criar uma instância de uma classe usamos seu nome e construtor. Em kotlin não utilizamos a palavra-chave'não', como mostra o exemplo:

```kotlin
class Medicamento(val formula: String, val posologia: String) {
}

val medicamento = Medicamento("C8H9NO2", "...")
```

>Aqui devemos observar que se uma classe possui um construtor, sendo ele primário ou secundário, o mesmo deve ser invocado. Por exemplo, no código abaixo a classe Medicamento possui um construtor secundário, o que torna obrigatório instanciá-la da forma `Medicamento("C8H9N02", "...")`.

```kotlin
class Medicamento {
    constructor(formula: String, posologia: String)
}
```

>Caso isso não seja feito e a classe seja instanciada como 'Medicamento()', sem que os argumentos sejam fornecidos para o  construtor, teremos um erro de compilação com a mesagem, `Error:(10, 35) Kotlin: No value passed for parameter 'formula' Error:(10, 35) Kotlin: No value passed for parameter 'posologia'`, onde 'formula' e 'posologia' são propriedades da classe.

## Funções membro
>Funções membro são funções declaradas dentro de classes. As regras que aprendemos anteriormente para a escrita de funções também se aplicam aqui com uma exceção, funções membro podem utilizar a palavra-chave 'this' para referenciar a instância atual.


>Funções membro sempre devem ser incocadas a partir de instâncias da classe. No Exemplo a seguir vemos um exemplo onde invocamos uma função a partir de ima instância de uma classe 'Medicamento'.

```kotlin
class Medicamento(val formula: String, val posologia: String) {

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}

fun main() {
    val medicamento = Medicamento("C8H9NO2", "...")

    if (medicamento.contem("C8H9NO2")) {
        println("Este medicamento contém paracetamol")
    }
}
```
>Observe que na Linha 3 utilizamos 'this' para diferenciar entre a propriedade e o parâmentro 'formula'. Tenha cuidado ao usar 'this' em classes que possuam apenas um construtores secundários, uma vez que eles não geram propriedades e, portanto, devem iniciar a classe ou delegar isso para um outro construtor. Entendido isso, caso uma classe possua apenas um construtor secundário ela deve conter propriedades que precisam ser iniciadas dentro dele.


>Por exemplo, o código a seguir vai falhar ao usarmos a palavra-chave 'this', pois a classe nãp possui uma propriedade chamada 'formula'.

```kotlin
class Medicamento {
    constructor(formula: String, posologia: String)

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}
```

>No código o erro emitido pelo compilador será `Error:(6, 40) Kotlin: Unresolved reference: formula`. Para corrigir esse erro a classe precisa iniciar uma propriedade chamada formula no construtor secundário, como o exemplo a seguir.

```kotlin
class Medicamento {
    val formula: String
    val posologia: String

    constructor(formula: String, posologia: String) {
        this.formula = formula
        this.posologia = posologia
    }

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}
```

>Contudo, o código acima é desnecessariamente longo e nesses casos podemos declarar a classe com um construtor primário, como vemos no proximo código.

```kotlin
class Medicamento(val formula: String, val posologia: String) {

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}
```
>Sendo assim, o código acima é equivalente ao anterior e também resolve o problema do 'this', porém de um jeito mais sucinto.

## Construtores e blocos de inicialização
>A delegação de um construtor secundário para o construtor primário ocorrerá como sendo a primeira instrução no construtor secundário. Isso que dizer, uma vez que eles passam a fazer parte do construtor primário, cada bloco de inicialização será executado antes de qualquer construtor secundário.


>Fundamentalmente, caso uma classe não possua nenhum construtor e não seja abstrata, um construtor público vazio lhe será atribuído. Suponho que nessa mesma classe não existia um construtor primário declarado, a delegação ocorrerá de forma implícita, como demonstrada o código a seguir.

```kotlin
class Medicamento {
     val formula: String

     constructor(formula: String, posologia: String) {
         this.formula = formula

         println("Construtor secundário")
     }

     init {
         println("Bloco de inicialização")
     }
}
```

>No exemplo acima, não importando a ordem da declaração do construtor secundário e do bloco de inicialização, as mensagens exibidas serão "Bloco de inicialização" e "Construtor secundário", nessa ordem.

## Níveis de acesso
>Em kotlin, não informar um nível de acesso para um tipo faz com que o modificador 'public' seja automaticamente aplicado. Além desse, geralmente não utilizado devido a redundância que causa, Kotlin possui três níveis de acesso. Dentre eles, 'protected' pode ser utilizado apenas por classes aninhadas. Quando utilizado em nível de arquivo, um erro será emitido pelo compilador, como no código a baixo.

```kotlin
protected class Medicamento constructor(val formula: String, var posologia: String)

Error:(3, 1) Kotlin: Modifier 'protected' is not applicable inside 'file'
```

>No proximo código utilizamos o modificador 'protected', que é sintaticamente permitido porque 'Tributacao' não está me nível de arquivo e é uma classe aninhada em 'Medicamento'.

```kotlin
class Medicamento {

    protected class Tributacao
}
```

>Private é um nível de acesso que restringe o escopo de utilização da classe apenas ao arquivo no qual ele foi declarada. Ao tentar utilizar uma classe 'private' fora do arquivo no qual ela foi declarada, um erro será emitido pelo compilador prematuramente, no momento da sua importação, como no exemplo.

```kotlin
private class Medicamento constructor(val formula: String, var posologia: String)

import br.com.devmedia.kotlin.a.Medicamento

fun main(args: Array) {
     println(Medicamento("C8H9NO2", "...12 anos ou mais variam de 500 a 1000 mg/
     dose com intervalos de 4 a 6 horas..."))
}


//Error:(3, 33) Kotlin: Cannot access 'Medicamento': it is private in file
```
*Em kotlin, a declaração de um pacote é feita com a palcavra reservada* 'package'*, seguida do nome do pacote. A importação de uma classe de outro pacote é feita com a palavra* 'import'*, seguida do nome completo da classe.*

>O terceiro modificador de acesso é 'internal', que permite criar uma instância da classe em qualquer lugar no módulo no qual ela foi declarado. Para Kotlin um módulo é um conjunto de fontes compilados junto. Isso torna esse comportamento difícil de ser verificado em um mesmo módulo do Intellij IDEA, projeto do Maven, Ant task, etc.