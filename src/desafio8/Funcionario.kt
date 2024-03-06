package desafio8

class Funcionario(var nome: String, var idade: Int, val salario: Long) {


}

fun main() {

    val funcionarios: List<Funcionario> = listOf(
        Funcionario("Bruno", 19, 255000),
        Funcionario("Bruno", 19, 0),
        Funcionario("Bruno", 19, 1000000000000000000),
        Funcionario("Bruno", 19, 5000000),
        Funcionario("Bruno", 19, 2000)
    )


    val listaSalario: List<Long> = funcionarios.map { it.salario }

    fun listaMaiorSalario(listaSalario: List<Long>): Long? {
        return listaSalario.maxOrNull()
    }

    val maiorSalario = listaMaiorSalario(listaSalario)

    if (maiorSalario != null) {
        println("O maior salário na lista é: $maiorSalario")
    } else {
        println("A lista de salários está vazia.")
    }
}