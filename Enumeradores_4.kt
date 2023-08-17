fun main (args: Array<String>) {
    var localizacao = Bussola.norte

    var localizacao2 = Bussola.sul
    println("Minha direção é $localizacao2")

    when (localizacao){
        Bussola.norte ->
            println("Estamos indo para o norte")
        Bussola.sul ->
            println("Estamos indo para o sul")
        Bussola.leste ->
            println("Estamos indo para o leste")
        Bussola.oeste ->
            println("Estamos indo para o oeste")
    }

    Bussola.values().forEach {
        println(it)
    }

}

enum class Bussola (var direcao: String){
    norte("Direção norte"),
    sul("Direção sul"),
    leste("Direção leste"),
    oeste("Direção oeste"),
}