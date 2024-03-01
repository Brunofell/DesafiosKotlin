package desafio3
fun main(){

    val pessoas: List<Pessoa> = listOf(
        Pessoa("João", 21),
        Pessoa("Alice", 21),
        Pessoa("Maria", 21),
        Pessoa("Bruno", 19),
        Pessoa("Carlos", 21)
    )

    var pessoaSortedByName = pessoas.sortedBy { it.nome }

    for (pessoa in pessoaSortedByName){
        println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")
    }
}