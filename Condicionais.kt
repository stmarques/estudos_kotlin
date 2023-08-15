fun main (args: Array<String>){

    //Exemplo 1: if/else
    var nota = 8

    if (nota >= 5){
        println("Exemplo 1: Aprovado")
    } else {
        println("Exemplo 1: Reprovado")
    }

    //Exemplo 2: if/elseif/else
    var cor = "azul"

    if (cor == "vermelho"){
        println("Exemplo 2: Você escolheu VERMELHO")
    } else if (cor == "azul") {
        println("Exemplo 2: Você escolheu AZUL")
    } else {
        println("Exemplo 2: Você escolheu AMARELO")
    }

    //Exemplo 3: when/else
    var numero = 15

    when (numero % 2){
        0 -> println("Exemplo 3: O número $numero é PAR")
        else -> println("Exemplo 3: O número $numero é ÍMPAR") //No lugar do else também poderia ser o número 1
    }

    //Exemplo 4: when
    var letra = "z"

    when (letra){
        "a", "e", "i", "o", "u" -> println("Exemplo 4: VOGAL")
        else -> println("Exemplo 4: CONSOANTE")
    }

    //Exemplo 5: while
    var numeros1 = listOf(1, 2, 3, 4, 5, 6, 7, 15, 58, 47, 12) //array

    var i = 0 // variável de apoio que representa a posição dos elementos dentro da array

    while (i <numeros1.size){ //enquanto a variavel i for menor do que o tamanho do array numeros
        if (numeros1[i] % 2 != 0){ //condicional que avalia se tem o resultado diferente de 0
            println("Exemplo 5: O número ${numeros1[i]} é ÍMPAR")
        }
        i++ //acumulador que acrescenta mais 1 na variavel posição, para o lopping voltar ao ponto onde ele parou
    }

    //Exemplo 6: for
    var numeros2 = listOf(1, 2, 3, 4, 5, 6, 7, 15, 58, 47, 12)

    for (i in 0 .. numeros2.size - 1) // o operador .. poderia ser substuído por until (até)
        if (numeros2[i] % 2 != 0){
            println("Exemplo 6: O número ${numeros2[i]} é ÍMPAR")
        }

    //Exemplo 7: while
    var frutas = listOf("Maçã", "Laranja", "Ponkan", "Limão", "Uva") //array

    var a = 0 // variável de apoio que representa a posição dos elementos dentro da array

    while (a < frutas.size) {
        println("Exemplo 7: " + frutas[a])
        a++ // acumalador que acrescenta mais 1 na variável posíção, para o lopping voltar para o ponto onde ele parou
    }

    //Exemplo 8: for in
    var frutas2 = listOf("Maçã", "Laranja", "Ponkan", "Limão", "Uva")

    for (fruta in frutas2){
        println("Exemplo 8: " + fruta)
    }

    //Exemplo 9: if/else if/else
    var temperatura = 25
    var clima = ""
    if (temperatura <= 0){
        clima = "muito frio"
    } else if (temperatura < 14){
        clima = "frio"
    } else if (temperatura < 21){
        clima = "agradável"
    } else if (temperatura < 30){
        clima = "um pouco quente"
    } else {
        clima = "muito quente"
    }
    println("Exemplo 9: A temperatura é de $temperatura graus, hoje está $clima!")

    //Exemplo 10: when/in/else
    var letter = "s"
    when (letter){
        in "a".."f"-> // O operador .. poderia ser substituito por until
            println("Exemplo 10: Você está na turma 1")
        in "g" .."l"->
            println("Exemplo 10: Você está na turma 2")
        in "m".."r"->
            println("Exemplo 10: Você está na turma 3")
        else ->
            println("Exemplo 10: Você está na turma 4")
    }

    //Exemplo 11: when/in/else usando o until
    var speed = 33
    when (speed){
        in 0 until 20 ->
            println("Exemplo 11: Primeira marcha")
        in 20 until 40 ->
            println("Exemplo 11: Segunda marcha")
        in 40 until 50 ->
            println("Exemplo 11: Terceira marcha")
        in 50 until 90 ->
            println("Exemplo 11: Quarta marcha")
        else ->
            println("Exemplo 11: Quinta marcha")
    }

    //Exemplo 12: while
    var tries =  0
    var diceNumber = 0
    do{
        tries += 1
        diceNumber = ((Math.random()* 6) + 1).toInt()

        println("Tentativa: $tries <-> Número Randomizado: $diceNumber")
    } while (diceNumber != 6)

    println("\nVocê tirou 6 após $tries tentativas")
}