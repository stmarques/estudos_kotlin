fun main (args: Array<String>) {

    saudar()

    var a = 10
    var b = 20

    somar(a,b)
    somar(7,9)
    somar(valor1 =  5, valor2 = 8)

    var x = subtrair(5,6)
    println("A subtração é $x")

    var y = subtrair(50,20)
    println("A subtração é $y")

    var z = dividir(15, 3)
    println("A divisão é $z")

    var w = multiplicar(25,6)
    println("A multiplicação é $w")

}

fun saudar (){
    println("Olá!")
}

fun somar(valor1: Int, valor2: Int){
    println("A soma é ${valor1 + (valor2 * 10)}")

}
 fun subtrair (valor1: Int, valor2: Int): Int{
     var resultado = valor1 - valor2
     return resultado
 }

fun dividir (valor1: Int, valor2: Int): Int{
    return valor1 / valor2
}

fun multiplicar (valor1: Int, valor2: Int) = valor1 * valor2 //single expression (inserir o código em uma única linha)