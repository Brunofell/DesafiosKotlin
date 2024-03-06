package desafio7

class ListaString(val lista : Array<String>) {

    fun maiorString(): String {

        var maiorPalavra= lista[0]

        for(itens in lista){
            if(itens.length >  maiorPalavra.length){
                maiorPalavra = itens
            }
        }

        return maiorPalavra

    }
}


fun main() {
    val lista = arrayOf("Bruno", "Bartolomeu", "Ana", "Dex", "NomeMegaCompridoGigaEnormeMTGrande")

    val listaString = ListaString(lista)

    val palavra = listaString.maiorString()

    print("O maior nome é: " + palavra)
}
