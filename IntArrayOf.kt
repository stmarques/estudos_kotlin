fun main(args: Array<String>) {

    //Exemplo com inArrayOf
    val idades : IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    //Exemplo para encontrar o maior valor usando o loop for
    var maiorIdade = 0 // Outra maneira seria: var maiorIdade = Int.MIN_VAlUE
    for(idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }

    println(maiorIdade)


}