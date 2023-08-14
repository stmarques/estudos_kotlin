fun main(args: Array<String>) {

     /* && AND
     TRUE + TRUE = TRUE
     TRUE + FALSE = FALSE
     FALSE + FALSE = FALSE

     Exemplo:
     Para dirigir é preciso ser maior de 18 anos e possuir CNH
     Se eu tenho +18 e tenho CNH, eu posso dirigir.
     Se eu tenho +18 mas não tenho CNH, eu não posso dirigir.
     Se eu não tenho +18 e não tenho CNH, eu não posso dirigir.
     */

    println( 2 > 3 && 5 < 4 && 1 == 10) // FALSE + FALSE = FALSE
    println( 2 < 3 && 5 < 4 && 1 != 10) // TRUE +  FALSE = FALSE
    println( 2 < 3 && 5 > 4 && 1 != 10) // TRUE + TRUE = TRUE

    /* || OR
    TRUE + TRUE = TRUE
    TRUE + FALSE = TRUE
    FALSE + FALSE = FALSE

    Exemplo:
    Se o joão arrumou a cama e/ou lavou a louça, ele ganha a mesada.
    Se ele não fez nenhum dos dois, ele não ganha mesada.
     */

    println( 2 > 3 || 5 < 4 || 1 == 10) // FALSE + FALSE + FALSE = FALSE
    println( 2 < 3 || 5 < 4 || 1 != 10) // TRUE + FALSE + TRUE = TRUE
    println( 2 < 3 || 5 > 4 || 1 != 10) // TRUE +  TRUE + TRUE = TRUE


}