fun main(){
    //Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

    print("Insira seu nome: " )
    var input1 = readLine() //Lê dados de entrada inseridos pelo usuário e atribui a variável

    print("Insira sua idade: " )
    var input2 = readLine()

    println("Olá, $input1, sua idade é $input2.")
}