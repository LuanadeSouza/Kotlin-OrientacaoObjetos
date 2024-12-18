Código Comentado
Função main
kotlin
Copy code
fun main() {
    println("Bem vindo ao Bytebank")

    // Criação de duas contas utilizando o construtor da classe `Conta`
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    // Exibe detalhes de ambas as contas
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    // Demonstra o uso dos métodos `deposita`, `saca` e `transfere`
    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    // Testando saques que excedem o saldo disponível
    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    // Testando transferência entre contas
    println("Transferência da conta da Fran para o Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

//Classe Conta
//A classe Conta encapsula o estado e o comportamento de uma conta bancária.
//Ela demonstra:
//Encapsulamento com uso de private set para restringir alterações diretas no saldo.
//Métodos que alteram o estado da conta com validações de regras de negócio.


class Conta(
    var titular: String, // Nome do titular da conta
    val numero: Int      // Número único da conta
) {
    var saldo = 0.0
        private set // Restrição para alterar o saldo apenas por métodos internos

    // Método para depósito com validação
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    // Método para saque com verificação de saldo disponível
    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    // Método para transferir valores entre contas
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

//Função testaCopiasEReferencias
//Demonstra a diferença entre cópias de valores primitivos e referências de objetos.

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++ // Incrementa somente a cópia, não o original

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    // Demonstra que objetos são referenciados
    val contaJoao = Conta("João", 1002)
    val contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}

//Função testaLacos
//Explora laços de repetição (while e for) para criar objetos dinamicamente.

fun testaLacos() {
    // Usando `while` para criar contas numeradas
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    // Usando `for` para iterar em ordem reversa
    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}

//Função testaCondicoes
//Demonstra controle condicional usando if-else e when.

fun testaCondicoes(saldo: Double) {
    // Usando `if-else`
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    // Usando `when` como alternativa ao `if-else`
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

Por que foi feito assim?
Encapsulamento: Protege o estado interno da classe e expõe apenas métodos seguros para manipulação do saldo.
Validação nos métodos: Evita inconsistências, como depósitos negativos ou saques maiores que o saldo.
Uso de when: Alternativa mais clara e concisa para múltiplas condições.
Demonstração de referência: Ajuda a entender como objetos são manipulados na memória.
Praticidade com loops: Facilita a criação dinâmica de múltiplos objetos.