//Exemplo de função para calcular os 10
//Primeiros números da sequência de Fibonacci
fun main (args: Array<String>){

    //Função
    fun sequenciaFibonacci(){

        //Declaração de variáveis
        var numero1 = 0
        var numero2 = 1

        for (sequencia in 1..10){  //Loop controlado de 1 até 10

            println("$sequencia -> $numero1")   //Impressão do conteúdo da variável numero1
            var soma = numero1 + numero2 //Soma dos 2 valores das variáveis

            numero1 = numero2   //Troca os valores entre as variáveis
            numero2 = soma

        }

    }

    sequenciaFibonacci()    //Executar função

}