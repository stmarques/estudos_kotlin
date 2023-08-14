fun main (args: Array<String>) {

    /*
    O operador ?: permite decidir pelo uso de uma atribuição de redundância, caso a variável analisada seja nula.
    Definição de coalescência: fusão, união, junção ou aderência do que estava separado.
    Coalescência em TI é a combinação de partições adjacentes de memória livre.

    Valor null
    Ao declarar uma variável, é preciso atribuir um valor.
    Mas se não houver um valor para atribuir no momento, atribuimos o null, para indicar que não há um valor.

    Variáveis anuláveis e não anuláveis
    • Tipos anuláveis podem conter null: é preciso permitir que a variavel seja anulável usando o operador ? ao final do tipo.
      Ex.: var nome: String? = Amanda
    • Tipos não anuláveis não podem conter null, não é possível reatribuir um null
      Ex.: var nome: String = Amanda

     Observações gerais
     • Uma variável pode ser definida como null para indicar que não tem um valor.
     • Variáveis não anuláveis não podem ter o valor null atribuído a elas.
     • Variáveis anuláveis podem ter o valor null atribuído a elas.
     • Para acessar métodos ou propriedades de variáveis anuláveis, é preciso usar operadores de chamada segura ?. ou de declação não nula !!
     • É possível usar instruções if/else com verificações de valores null para acessar variáveis anuláveis em contextos anuláveis.
     • É possível converter uma variável anulável em um tipo não anulável com expressões if/else.
     • Com a expressão if/else ou os operadores !=, == ou ?: é possível oferecer um valor padrão no caso de uma variável anulável ser null.

     Site de exemplo: https://l1nq.com/qCQkI
     */

    //Exemplo 1: conversão de null para não null
    var age: Int? = null //Criação da varivável age do tipo inteiro anulável que recebe null
    var myAge = age ?: 0 //Criação da variavel my age. Se a variável age estiver null, myAge recebe 0
    println("Exemplo 1.1: " + myAge)

    age = 25 //A variável age recebe o valor 25
    var newAge = age ?: 0 //A variável new age recebe o valor não nulo da variável age
    println("Exemplo 1.2: " + newAge)

    //Exemplo 2: conversão de não null para null
    var favoriteActor: String? =
        "Sandra Oh" // Criação da variavel favoriteActor do tipo string anulável que recebe o valor "Sandra Oh"
    println("Exemplo 2.1: " + favoriteActor)

    favoriteActor = null //Conversão da variável favoriteActor para null
    println("Exemplo 2.2: " + favoriteActor)

    //Exemplo 3: conversão de não null para null
    var number: Int? = 10 //Criação da variável number do tipo inteiro anulável
    println("Exemplo 3.1: " + number)

    number = null
    println("Exemplo 3.2: " + number)

    //Exemplo 4: processar variáveis anuláveis com o operador de chamada segura ?.
    //Só podemos aplicar o método .length em variáveis não anuláveis
    var nome1: String= "Amanda"
    println("Exemplo 4.1: A variável possui $nome1 " + nome1.length + " caracteres")
    //Não é possível usar o método .lenght em variáveis anuláveis (remova os comentários das linhas abaixo para rodar o trecho de código)
    //var nome2: String? = "Amanda"
    //println("Exemplo 4.2: A variável $nome2 possui " + nome2.length + " caracteres") //resultado: erro de compilação
    //Para isso usamos o operador de chamada segura ?. para acessar as propriedades de variáveis anuláveis
    var nome3: String?= "Amanda"
    println("Exemplo 4.3: A variável possui $nome3 " + nome3?.length + " caracteres")
    nome3 = null
    println("Exemplo 4.4: " + nome3?.length)
    //Observação: também é possível usar os operadores de chamada segura ?. em variáveis não anuláveis embora não seja necessário

    //Exemplo 5: processar variaveis anulaveis com o operador de declaração não nula !!
    var cidade1: String? = "São Paulo"
    println("Exemplo 5.1: A variável $cidade1 possui " + cidade1!!.length + " caracteres")
    //Observação: usamos o operador !!. quando temos certeza que não temos uma variável nula
    //Atenção! Remova os comentários das linhas abaixo para rodar o trecho de código.
    //var cidade2: String? = null
    //println(cidade2!!.length) //erro de compilação NullPointerException
    /* Observação: em outras linguagens de de programação que não contém o atributo de proteção contra valores nulos,
    o erro NullPointerException é uma causa frequente de falhas no app. Dessa forma, o Kotlin elimina uma grande causa das falhas
    de programas porque inclui a proteção contra valores null na linguagem.
     */

    //Exemplo 6: condicionais if/else para verificação de valores null
    var estado: String? = "Rio de Janeiro" //rode este código 2 vezes, na 2º vez substitua o valor por null

    if (estado != null){
        println("Exemplo 6: A variável $estado possui ${estado.length} caracteres")
    } else {
        println("Exemplo 6: valor não atribuido")
    }

    //Exemplo 7: condicionais if/else usando somente uma instrução println
    var pais: String? = "Brasil" //rode este código 2 vezes, na 2ª vez substitua o valor por null

    val numeroCaracteres = if (pais != null){
        pais.length
    } else {
        0
    }
    println("Exemplo 7: A variável $pais possui ${numeroCaracteres} caracteres")

    //Exemplo 8: condicionais if/else usando o operador de comparação ==
    var regiao: String? = "Sudeste" //rode este código 2 vezes, na 2ª vez substitua o valor por null

    var numeroCaracteres2 = if (regiao == null){
        0
    } else {
        regiao.length
    }
    println("Exemplo 8: A variável $regiao possui ${numeroCaracteres2} caracteres")

    //Exemplo 9: operador Elvis ?:
    //Observação: o operador ?: recebeu o nome de Elvis porque parece um emoticon com topete
    val bioma: String? = "Mata Atlântica" //rode este código 2 vezes, na 2ª vez substitua o valor por null

    var numeroCaracteres3 = bioma?.length?: 0

    println("Exemplo 9: A variável $bioma possui ${numeroCaracteres3} caracteres")

}