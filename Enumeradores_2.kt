fun main (args: Array<String>) {

    val assento1 = posicaoAssento.aisle
    println(assento1.nomeAssento)

    val assento2 = posicaoAssento.middle
    println(assento2.nomeAssento)

    val assento3 = posicaoAssento.window
    println(assento3.nomeAssento)
}

enum class posicaoAssento (var nomeAssento: String){
    aisle("corredor"),
    middle("meio"),
    window("janela")
}