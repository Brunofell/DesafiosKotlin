package desafio5

fun main() {
    val maiorNumero = {num1: Int, num2: Int -> if(num1 > num2){
        println("O número maior é: ${num1}")
    }else{
        println("O número maior é: ${num2}")
    } }


    val numero1 = 5
    val numero2 = 10

    println(maiorNumero(numero1, numero2))
}