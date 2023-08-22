/*Caracteristicas do uso de classes em orientação a objetos:

• Definem propriedades para armazenar valores.
• Definem métodos para fornecer funcionalidades.
• Definem métodos construtores (ou métodos inicializadores) para criar uma instância de uma classe (também chamada de objeto).
• O método construtor cria uma instancia da classe e tem por obrigação alimentar qualquer propriedade que não tenha sido inicializada.
• Para instanciar uma classe, criamos uma variável e atribuímos a ela a chamada do método construtor da classe que desejamos.
  Para chamar o método construtor, usamos apenas o nome da classe, passando os valores dos parâmetros do método.
• Podem ser estendidas para expandir suas funcionalidades, além das presentes em suas implementações.
• Trabalham com herança, o que permite que uma classe possa herdar as caracteristicas de outras.
• Type casting, que lhe permite checar e interpretar uma classe como sendo outra.

OBS.: dentro das classes, as funções passam a ser chamadas de métodos, e as variáveis são chamadas de propriedades.

*/
package model

import java.time.LocalDate
import java.time.Month
import java.time.Period

open class Pessoa { //o open permite a herança em outra classe

    //Propriedades/campo/atributo do objeto
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000,9,10)
    var peso: Int = 0
    var altura: Double = 0.0
    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }

    //métodos/comportamentos
    open fun exibirDados(){ //o método de um objeto deve ser um verbo de ação
        //o open é usado para permitir que outra classe também use uma chamado exibirDados, seja sobreposta
        println("Nome: $nome")
        println("Data de Nascimento: $dataNascimento")
        println("Idade: $idade")
        println("Peso: $peso")
        println("Altura: $altura")
        println("------------------------------------")
    }

//    fun calcularIdade(): Int{
//       var idade = Period.between(dataNascimento, LocalDate.now()).years
//        return idade
//    }

}