package desafio1

class Ex1(){
    fun parOuImpar(num: Int){
        var verificaNum = num%2;
        if(num == 0){
            println("O número $num é impar.")
        }else if(verificaNum == 0){
            println("O número $num é par.")
        }else if(verificaNum != 0){
            println("O número $num é impar")
        }
    }
}