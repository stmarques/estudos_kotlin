fun main (args: Array<String>){

    /*
    MAP: método que percorre a coleção e executa uma closure em cada um de seus elementos, devenvolvendo a nova coleção gerada.
    Exemplo: sequência de Fibonacci

    FILTER: método que filtra uma coleção, devolvendo outra com os elementos que foram filtrados.
    Essa função deve conter uma lógica que será implementada em cada um dos elementos do Array e,
    caso essa lógica retorne true, aquele elemento deverá fazer parte do novo Array.

    REDUCE: método que recebe dois parâmetros, o primeiro chamado acc, que contém o valor inicial da operação
    e o segundo chamado it, que contém uma closure que receberá, a cada iteração, o resultado da operação e o elemento do Array.
    GENERICS: na sintaxe do método Reduce usamos um tipo chamado it, não é um tipo válido ou existente na linguagem, mas é usado na assinatura do método
    para representar um tipo genérico. O método reduce exige que o mesmo tipo it usado no parametro seja usado dentro da closure e seja o tipo de retorno da função.
    Esse tipo foi definido logo após o nome do método (reduce <it>) e isso indica que, nesse método, será usado um tipo chamado de "it",
    que pode ser representado por qualquer tipo existente ou criado.
    */

    //Exemplo Filter, Sequência de Fibonacci
    var numeros = listOf(1,2,3,4,5) // Criação de uma lista de números inteiros

    var pares = numeros.filter{// Criação de uma variavel que recebe a lista numeros e chama o método filter
        it % 2 == 0 // Filtrar todos os números pares (resto da divisão por 2 igual a 0
    }

    println("Exemplo 1: "+pares)

    //Exemplo Reduce
    var soma = numeros.reduce { atual, proximo -> //Criação de uma variavel soma que recebe a lista numeros e aplica o método reduce
        atual + proximo //soma entre os parametros do método reduce
    }

    println("Exemplo 2: "+soma)

    //Exemplo Filter
    var frutas = listOf("uva", "manga", "uvaia", "abacaxi", "morango") // Criação de uma lista de strings

    var frutasM = frutas.filter { // Criação de uma variavel que recebe a lista de strings e chama o método filter
        it .startsWith("m") // Filtrar todas as frutas que começam com a letra M
    }
    println("Exemplo 3:"+frutasM)

    //Exemplo Map
    var frutasMaiusculas = frutas.map { //criação de uma variavel que recebe a lista frutas e aplica o método map
        it.uppercase() //parametro do método map chama outro método para aplicar letras maisculas aos elementos da lista
    }

    println("Exemplo 4: "+frutasMaiusculas)

    //Exemplo Reduce
    var movimentacao = arrayOf<Double>( //criação de uma lista de doubles
        2500.00,
        -1300.00,
        350.00,
        -90.00,
        1500.00,
        -900.00,
        -800.00
    )

    var balance = movimentacao.reduce { acc, it -> //criação de uma variavel que recebe a lista movimentação e aplica o método reduce
        println(
            "Exemplo 5: Saldo: " + String.format("%.2f ",acc) + // uso do método format para formatar os valores em double
                    "Lançamento: " + String.format("%.2f ",it)) // uso do método format para formatar os valores em double
        (acc+it)
    }
    println("Exemplo 5: Saldo na conta no valor de R$ " + String.format("%.2f",balance)) //uso do método format para formatar os valores em double


    //Exemplo Filter
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10) //criação de uma lista de números inteiros

    //criação de uma variavel que recebe a lista de inteiros, aplica o método filter usando uma condicional filtra apenas os valores impares
    // na divisão por 2 o resultado diferente de 0
    var evenNumbers = numbers.filter { it%2 != 0 }
    println("Exemplo 6: $evenNumbers")

    // criação de uma variacel que recebe a lista de inteiros e aplica o método map usando uma operação de multiplicação
    var multiplyNumbers = numbers.map { it * it }
    println("Exemplo 7: $multiplyNumbers")

    //criação de uma variacel que recebe a lista de inteiros e aplica o método reduce usando uma operação de soma
    var sumNumbers = numbers.reduce { acc, it ->
        println("Exemplo 8: acc = $acc, it = $it")
        acc + it}
    println("Exemplo 9: Resultado da Somatória: $sumNumbers")

}






