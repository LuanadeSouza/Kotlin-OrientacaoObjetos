# Bytebank - Projeto de Estudo em Orientação a Objetos com Kotlin

Este é um projeto de estudo desenvolvido para explorar os conceitos de **Orientação a Objetos (POO)** utilizando a linguagem **Kotlin**. Durante o desenvolvimento, aplicamos princípios fundamentais da programação orientada a objetos, como encapsulamento, abstração e composição, por meio de simulações de operações bancárias.

---

## 🚀 Funcionalidades

- **Criação de Contas Bancárias**: Cada conta possui titular, número e saldo inicial.
- **Operações Bancárias**:
  - Depósito
  - Saque
  - Transferências entre contas
- **Simulação de Cenários**:
  - Operações com saldos insuficientes
  - Validação de valores positivos para depósitos
  - Teste de referências e cópias de objetos
  - Laços de repetição para criação de múltiplas contas fictícias
- **Condições**:
  - Avaliação do saldo para determinar o estado da conta (positiva, neutra ou negativa).

---

## 🛠️ Tecnologias Utilizadas

- **Kotlin**: Linguagem principal para implementar os conceitos de OOP.
- **IntelliJ IDEA**: IDE para desenvolvimento e execução do projeto.

---

## 🔧 Estrutura do Projeto

### 1. **Classe Conta**
A classe `Conta` representa uma conta bancária e encapsula as operações possíveis:
- **`deposita`**: Adiciona um valor ao saldo, se for positivo.
- **`saca`**: Retira um valor do saldo, se houver saldo suficiente.
- **`transfere`**: Transfere um valor para outra conta, se o saldo for suficiente.

### 2. **Classes de Funcionários**
- **`Funcionario`**: Classe abstrata base que define os atributos e métodos comuns a todos os funcionários.
- **`Gerente` e `Diretor`**: Funcionários administrativos que implementam bonificações específicas e autenticação por senha.
- **`Analista` e `Auxiliar`**: Funcionários operacionais com cálculo de bonificação proporcional ao salário.

### 3. **Interfaces**
- **`Autenticavel`**: Interface para implementar autenticação em diferentes classes, como `Cliente` e `FuncionarioAdmin`.

### 4. **Funções de Teste**
- **`main`**: Ponto de entrada do projeto. Realiza operações principais e simula cenários.
- **`testaComportamentosConta`**: Testa operações de depósito, saque e transferência entre contas.
- **`testaContasDiferentes`**: Demonstra o comportamento de contas correntes e poupança.
- **`testaFuncionarios`**: Simula a criação e bonificação de diferentes tipos de funcionários.
- **`testaAutenticacao`**: Valida o processo de autenticação para gerentes, diretores e clientes.
- **`testaCopiasEReferencias`**: Demonstra a diferença entre cópias de valores e referências de objetos.
- **`testaLacos`**: Utiliza laços `while` e `for` para criar e exibir várias contas fictícias.
- **`testaCondicoes`**: Avalia o estado do saldo de uma conta usando estruturas condicionais `if` e `when`.

### 5. **Classes Auxiliares**
- **`CalculadoraBonificacao`**: Calcula e mantém o total de bonificações dos funcionários.
- **`SistemaInterno`**: Gerencia autenticação de usuários com base na interface `Autenticavel`.
- **`ContaCorrente` e `ContaPoupanca`**: Extensões da classe `Conta` que definem comportamentos específicos para saques.

---

## 📚 Aprendizados

- **Encapsulamento**: Controle de acesso ao saldo, evitando alterações externas diretas.
- **Composição**: Reutilização de métodos para criar operações mais complexas, como transferências.
- **Laços e Condições**: Uso de estruturas de controle (`while`, `for`, `if`, `when`) para simular cenários bancários.
- **Imutabilidade e Referências**: Diferença entre valores imutáveis e referências compartilhadas de objetos.

---

## 🔍 Neste Projeto são exploradas as seguintes técnicas e tecnologias:

- **Função main()**: Inicia o programa e executa os testes principais.
- **Variáveis mutáveis e imutáveis**: Armazenam valores que podem ou não ser modificados.
- **Operações aritméticas**: Soma, subtração, multiplicação e divisão em cálculos financeiros.
- **Auto incremento**: Incrementa valores dentro de laços ou cálculos.
- **Strings e String template**: Utilização de textos e concatenação com variáveis ou funções.
- **Estrutura condicional**: Uso de `if`, `else` e `when` para decisões lógicas.
- **Estrutura de repetição ou laços**: Implementação de `while` e `for` para iterações.
- **Implementação de classes**: Definição de estruturas como contas e funcionários.
- **Criação de objetos**: Instanciação de classes para criar novas entidades.
- **Construtores**: Definição de como inicializar objetos com propriedades específicas.
- **Properties**: Mecanismo para acessar e modificar atributos das classes.
- **Métodos**: Implementação de comportamentos associados às classes.
- **Parâmetros nomeados**: Passagem clara e específica de argumentos para métodos e construtores.
- **Herança e polimorfismo**: Criação de hierarquias entre classes e sobrescrita de métodos.
- **Interfaces**: Definição de contratos de comportamento reutilizáveis entre classes.
- **Encapsulamento**: Restrição de acesso direto a propriedades sensíveis, como saldo e senha.
- **Métodos de acesso**: Controle de visibilidade e manipulação de membros de classe, como `private`, `protected` e `public`.

---

## 💻 Como Executar

### Pré-requisitos
1. **Kotlin** instalado.
2. **IntelliJ IDEA** ou qualquer editor compatível com Kotlin.

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/bytebank-oop.git
   ```
2. Abra o projeto no IntelliJ IDEA.
3. Execute a função `main` na classe principal.

---

## 🧑‍💻 Autor

Desenvolvido por **Luana Souza** como parte dos estudos do curso **Kotlin: Orientação a Objetos**.

---

## 📝 Licença

Este projeto é para fins educacionais e está sob licença [MIT](https://opensource.org/licenses/MIT).
