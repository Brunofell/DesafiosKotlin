package desafio4

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("Digite um palavra: ")
    val palavra = scanner.next()

    val palavraReversa = palavra.reversed()

    if(palavra == palavraReversa){
        print("Essa palavra é um palíndromo.")
    }else{
        print("Essa palavra não é um palíndromo.")
    }
}

