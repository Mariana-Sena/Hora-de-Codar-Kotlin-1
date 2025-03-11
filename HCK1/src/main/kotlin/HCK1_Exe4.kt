import kotlin.system.exitProcess

fun main(){
    //Escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.

    var base: Float
    var altura:Float
    var dMaior:Float
    var dMenor:Float
    var bMaior:Float
    var bMenor:Float
    var raio:Float
    var area:Float
    var pi = 3.1416
    var input = ""

    fun options() {
        println(
            "\nSelecione uma opção: " + "\n" +
                    "1) Retângulo" + "\n" +
                    "2) Quadrado" + "\n" +
                    "3) Losango" + "\n" +
                    "4) Trapézio" + "\n" +
                    "5) Paralelograma" + "\n" +
                    "6) Triângulo" + "\n" +
                    "7) Círculo" + "\n" +
                    "8) Sair")
        print("Insira o número da opção desejada: " )
        input = readLine().toString()
    }

    options() //sendo chamada antes de passar pelo when, assim a lista é exibida antes


    when (input) {
        1.toString() -> {
            println("\nRetângulo ")
            print("Informe o valor da base: ")
            base = readLine()?.toFloat()!! //nulabilidade

            print("Informe o valor da altura: ")
            altura = readLine()?.toFloat()!!

            println("A área deste retângulo é igual a ${base*altura}")
        }

        2.toString() -> {
            println("\nQuadrado")
            print("Informe o valor da base: ")
            base = readLine()?.toFloat()!!

            print("A área deste quadrado é igual a ${base*base}")
        }

        3.toString() -> {
            println("\nLosango")
            print("Informe o valor da diagonal maior: ")
            dMaior = readLine()?.toFloat()!!

            print("Informe o valor da diagonal menor: ")
            dMenor = readLine()?.toFloat()!!

            println("A área deste losango é igual a ${(dMaior*dMenor)/2}")
        }

        4.toString() -> {
            println("\nTrapézio")
            print("Informe o valor da base maior: ")
            bMaior = readLine()?.toFloat()!!

            print("Informe o valor da base menor: ")
            bMenor = readLine()?.toFloat()!!

            print("Informe o valor da altura: ")
            altura = readLine()?.toFloat()!!

            println("A área deste trapézio é igual a ${(bMaior+bMenor)*altura/2}")
        }

        5.toString() -> {
            println("\nParalelograma")
            print("Informe o valor da base: ")
            base = readLine()?.toFloat()!!

            print("Informe o valor da altura: ")
            altura = readLine()?.toFloat()!!

            println("A área deste paralelograma é igual a ${base*altura}")
        }

        6.toString() -> {
            println("\nTriângulo")
            print("Informe o valor da base: ")
            base = readLine()?.toFloat()!!

            print("Informe o valor da altura: ")
            altura = readLine()?.toFloat()!!

            println("A área deste triângulo é igual a ${base*altura/2}")
        }

        7.toString() -> {
            println("\nCírculo")
            print("Informe o valor do raio: ")
            raio = readLine()?.toFloat()!!

            print("A área deste círculo é igual a ${pi*(raio*raio)}")
        }

        8.toString() -> {
            println("Programa interrompido.")
            exitProcess(0) //Interrompe a execução do programa (pertencente ao pacote kotlin.system)
        }

        else -> {
            println("Opção Inválida")
        }
    }
    options()
}

