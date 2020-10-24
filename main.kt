fun main() {
    println("Olá !! Seja bem vindo ao bytebank")

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(100.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(200.0)

    val contaJoao = Conta("João", 1002)
    contaJoao.deposita(300.0)

    val contaMaria = Conta("Maria",  1003)
    contaMaria.deposita(400.0)




    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println()
    println("depositando na conta da Fran")
    println(contaFran.saldo)
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println("Sacando")

    println("sacando Da conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)
    println()

    print("Sacando da conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.saldo)
    println()

    println("sacando Da conta do Alex")
    contaAlex.saca(2500.0)
    println(contaAlex.saldo)
    println()

    if (contaFran.transferencia(100.0, contaAlex)) {
        println("Transferencia Com sucesso.")
    } else {
        println("Falha na transferencia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)


}


class Conta(
    var titular: String,
    var numero: Int
) {

    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Não foi possivel sacar")
        }
    }

    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo() : Double{
//        return saldo
//    }
//
//    fun setSaldo (valor : Double){
//        if(valor > 0 ){
//            saldo = valor
//        }

}


//fun testaCopiasEReferencias (){
//    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")
//

//
//    println("titular conta joão: ${contaJoao.titular}")
//    println("titular conta maria: ${contaMaria.titular}")
//
//
//}

////    for (i in 5 downTo 1 step 1) {
////
//val titular: String = "Alex $i"
//val numeroConta: Int = 1000 + i
//var saldo = i + 10.0
//println("Titular $titular")
//println("O numero da conta é $numeroConta")
//println("Seu saldo é de $saldo")
//i++
//
//
//when {
//    saldo > 0.0 -> println("Seu saldo é positivo")
//    saldo == 0.0 -> println("A conta é neutra!")
//    else -> println("A conta é negativa")
//
//}
//println()
//
////        fun testaCondicoes(saldo: Double) {
////            if (saldo > 0.0) {
////                println("Conta é positiva")
////            } else if (saldo == 0.0) {
////                println("A conta é neutra")
////            } else {
////                println("A conta é negativa")
////            }
////
////
////        }
//}
//}
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//
//    }
