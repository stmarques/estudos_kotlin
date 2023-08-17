fun main(args: Array<String>){

    //Exemplo de encapsulamento de funções, função que retorna função
    fun double(x: Int): Int = x * 2
    println(double(8))
    fun triple(x: Int) = x * 3
    println(triple(10))
}