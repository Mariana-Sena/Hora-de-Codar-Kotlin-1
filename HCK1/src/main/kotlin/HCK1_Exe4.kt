fun main(){
    //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.

    var base
    base = readLine().toDouble()
    var altura:Int
    var dMaior:Int
    var dMenor
    var bMaior
    var bMenor
    var raio
    var area
    var pi = 3.1416

    println("Selecione uma opção: " + "\n" +
            "1) Retângulo" + "\n" +
            "2) Quadrado" + "\n" +
            "3) Losango" + "\n" +
            "4) Trapézio" + "\n" +
            "5) Paralelograma" + "\n" +
            "6) Triângulo" + "\n" +
            "7) Círculo" )

    print("Insira o número da opção desejada: " )
    var input = readLine()

    when (input) {
        1 -> {
            println(

        }
        2-> println("x é 2")
        3 -> println("x é 3")
        else -> println("x não é 1, 2 ou 3")
    }

}