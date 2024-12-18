# Bytebank - Projeto de Estudo em Orientação a Objetos com Kotlin

Este é um projeto de estudo desenvolvido para explorar os conceitos de **Orientação a Objetos (OOP)** utilizando a linguagem **Kotlin**. Durante o desenvolvimento, aplicamos princípios fundamentais da programação orientada a objetos, como encapsulamento, abstração e composição, por meio de simulações de operações bancárias.

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
- `deposita`: Adiciona um valor ao saldo, se for positivo.
- `saca`: Retira um valor do saldo, se houver saldo suficiente.
- `transfere`: Transfere um valor para outra conta, se o saldo for suficiente.

### 2. **Funções de Teste**

- **`main`**: Ponto de entrada do projeto. Realiza as operações principais e simula cenários com instâncias de `Conta`.
- **`testaCopiasEReferencias`**: Demonstra a diferença entre cópias de valores e referências de objetos.
- **`testaLacos`**: Utiliza laços `while` e `for` para criar e exibir várias contas fictícias.
- **`testaCondicoes`**: Avalia o estado do saldo de uma conta usando estruturas condicionais `if` e `when`.

### 3. **Funções Auxiliares**
- Métodos encapsulados na classe `Conta` para proteger os dados sensíveis e validar as operações.

---

## 📚 Aprendizados

- **Encapsulamento**: Controle de acesso ao saldo, evitando alterações externas diretas.
- **Composição**: Reutilização de métodos para criar operações mais complexas, como transferências.
- **Laços e Condições**: Uso de estruturas de controle (`while`, `for`, `if`, `when`) para simular cenários bancários.
- **Imutabilidade e Referências**: Diferença entre valores imutáveis e referências compartilhadas de objetos.

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

## 🔮 Melhorias Futuras

- Adicionar uma interface gráfica para interagir com as operações bancárias.
- Criar mais cenários de teste automatizado.
- Implementar novos tipos de contas, como contas poupança e contas correntes.
- Introduzir relatórios financeiros e exportação de dados.

---

## 🧑‍💻 Autor

Desenvolvido por **Luana Dev** como parte dos estudos do curso **Kotlin: Orientação a Objetos**.

---

## 📝 Licença

Este projeto é para fins educacionais e está sob licença [MIT](https://opensource.org/licenses/MIT).
