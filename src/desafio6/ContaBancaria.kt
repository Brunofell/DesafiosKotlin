package desafio6

class ContaBancaria(val saldo: Double, val limite: Double) {

    fun saque(valor: Double) {
        try {
            if (valor > saldo) {
                throw AuthException("Saldo ${saldo}R$ é insuficiente para retirada de ${valor}.")
            } else if (valor > limite) {
                throw AuthException("Limite de ${limite}R$ é menor que o valor da retirada ${valor}")
            } else {
                println("Valor do saque: ${valor}")
                println("Saldo atual: ${saldo}")
            }
        } catch (e: AuthException) {
            println("Mensagem de erro: ${e.message}")
        }
    }
}