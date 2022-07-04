fun main() {
   val bulbasauro = Pokes(
       "Bulbasauro", 
       "Grama/Tóxico", 
       "Fogo/Gelo/Psíquico/Voador", 
       "Chicote de Vinhas", 
       "Folhas Navalhas"
   )
   
   val charmander = Pokes(
       "Charmander", 
       "Fogo", 
       "Água/Ground/Pedra", 
       "Arranhão", 
       "Cauda de Chamas"
   )
   
   val squirtle = Pokes(
       "Squirtle", 
       "Água", 
       "Grama/Elétrico", 
       "Investida", 
       "Chuva Borrifante"
   )
   
   val pikachu = Pokes(
       "Pikachu", 
       "Elétrico", 
       "Ground", 
       "Surra de Cauda", 
       "Relâmpago"
   )
   
   val eevee = Pokes(
       "Eevee", 
       "Normal", 
       "Lutador", 
       "Planejamento", 
       "Mordida"
   )

   
   val pokemon = mutableListOf(bulbasauro, charmander, squirtle, pikachu, eevee)
   
   println("Iniciais de Kanto")
   println("-----------------------------------------------------------------------------")
   pokemon.forEach { 
       print("Nome: ${it.nome}") 
       print("    ")
       print("Tipo: ${it.tipo}")
       print("    ")
       println("Fraqueza: ${it.fraqueza}")
       print("Ataque Principal: ${it.atack01}")
       print("    ")
       println("Ataque Secundário: ${it.atack02}")
       println()
   }

}

data class Pokes(
	val nome:String,
    val tipo:String,
    val fraqueza:String,
    val atack01:String,
    val atack02:String
)
