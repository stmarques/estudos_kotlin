package model

import java.time.LocalDate
import java.time.Period

class Empresa {

    var nomeEmpresa: String =""
    var segmento: String = ""
    var estado: String =""
    var cidade: String =""
    var anoFundacao: LocalDate = LocalDate.of(2000,3,3)
    var funcionarios: Int = 0
    val tempo: Int
        get(){
            return Period.between(anoFundacao, LocalDate.now()).years
        }

        fun dadosEmpresa(){
        println("Nome da Empresa:$nomeEmpresa")
        println("Segmento :$segmento")
        println("Estado:$estado")
        println("Cidade:$cidade")
        println("Ano de fundação:$anoFundacao")
        println("Funcionários:$funcionarios")
    }
}