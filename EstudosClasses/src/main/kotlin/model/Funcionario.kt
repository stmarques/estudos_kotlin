package model

class Funcionario: Pessoa() { // Funcionário herda(:) a classe pessoa

    var cargo: String = ""
    var salario: Double = 0.0

    override fun exibirDados(){ //já existe uma função exibirDados na superclasse pessoa,
    // então usamos o override para subscrever o nome da classe

        println("Nome: $nome")
        println("Data de Nascimento: $dataNascimento")
        println("Idade: $idade")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Altura: $salario")
        println("Altura: $cargo")
        println("------------------------------------")

    }



}