fun main (args: Array<String>) {

    val mes1 = mes.janeiro
    val mes2 = mes.fevereiro
    val mes3 = mes.março
    val mes4 = mes.abril
    val mes5 = mes.maio
    val mes6 = mes.junho
    val mes7 = mes.julho
    val mes8 = mes.agosto
    val mes9 = mes.setembro
    val mes10 = mes.outubro
    val mes11 = mes.novembro
    val mes12 = mes.dezembro

    println("$mes1 mês " + mes1.numeroMes)
    println("$mes2 mês " + mes2.numeroMes)
    println("$mes3 mês " + mes3.numeroMes)
    println("$mes4 mês " + mes4.numeroMes)
    println("$mes5 mês " + mes5.numeroMes)
    println("$mes6 mês " + mes6.numeroMes)
    println("$mes7 mês " + mes7.numeroMes)
    println("$mes8 mês " + mes8.numeroMes)
    println("$mes9 mês " + mes9.numeroMes)
    println("$mes10 mês " + mes10.numeroMes)
    println("$mes11 mês " + mes11.numeroMes)
    println("$mes12 mês " + mes12.numeroMes)

}
enum class mes (var numeroMes: Int){
    janeiro(1),
    fevereiro(2),
    março(3),
    abril(4),
    maio(5),
    junho(6),
    julho(7),
    agosto(8),
    setembro(9),
    outubro(10),
    novembro(11),
    dezembro(12)

}