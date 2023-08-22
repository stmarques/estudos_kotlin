import model.Empresa
import model.Funcionario
import model.Pessoa
import java.time.LocalDate

fun main(args: Array<String>) {

    val pessoa = Pessoa()
    pessoa.nome = "Ana"
    pessoa.altura = 1.70
    pessoa.peso = 66
    pessoa.dataNascimento = LocalDate.of(2001,9,21)

    val pessoa2 = Pessoa()
    pessoa2.nome = "João"
    pessoa2.altura = 1.80
    pessoa2.peso = 67
    pessoa2.dataNascimento = LocalDate.of(1958,8,7)

    pessoa.exibirDados()
    pessoa2.exibirDados()

    println(pessoa2.idade) //Chamar uma única função

    val empresa = Empresa()
    empresa.nomeEmpresa = "Tech & Tour"
    empresa.segmento = "Tecnologia"
    empresa.estado = "São Paulo"
    empresa.cidade = "São Paulo"
    empresa.anoFundacao = LocalDate.of(2015,2,20)
    empresa.funcionarios = 15

    empresa.dadosEmpresa()

    val funcionario = Funcionario()
    funcionario.nome = "Alcides"
    funcionario.altura = 1.58
    funcionario.peso = 58
    funcionario.dataNascimento = LocalDate.of(1985,8,5)
    funcionario.cargo = "Analista"
    funcionario.salario = 8.000

    funcionario.exibirDados()


}