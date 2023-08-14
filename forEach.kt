fun main(args: Array<String>){

    //Exemplo com intArreyOf
    val idades:IntArray= intArrayOf(25,19,33,20,55,40)

    //Exemplo para encontrar a idade de menor valor usando o forEach
    var menorIdade = Int.MAX_VALUE
        idades.forEach { idade ->
            if(idade < menorIdade){
                menorIdade = idade
            }
        }

    println(menorIdade)
}