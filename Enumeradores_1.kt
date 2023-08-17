fun main (args: Array<String>) {

    //Os enumeradores são um conjunto limitado de valores

    val tipoDaConta1 = TipoConta.CORRENTE // Criação de uma constante  que recebe o enumarador
    val tipoDaConta2 = TipoConta.POUPANCA
    val tipoDaConta3 = TipoConta.SALARIO

    println(tipoDaConta1.nomeConta) // Imprimir a constante que recebe o enumerador renomeado
    println(tipoDaConta2.nomeConta)
    println(tipoDaConta3.name) // chamar o nome do enumerador

}
enum class TipoConta(var nomeConta: String){ // Criação de uma classe de enumeradores string TipoConta
    CORRENTE (nomeConta = "Corrente"), // Enumerador renomeado como Corrente
    POUPANCA (nomeConta = "Poupança"), // Enumerador renomeado como Poupança
    SALARIO (nomeConta = "Salário") // Enumerador renomeado como Salário
}