# Calculadora - Exemplo de TDD

Este projeto foi desenvolvido durante uma aula sobre **TDD (Test Driven Development)**, onde implementamos testes simples para uma calculadora em Java utilizando JUnit 5.

## Descrição

O objetivo foi demonstrar como criar testes automatizados para métodos básicos de uma calculadora, cobrindo as operações de soma, subtração, multiplicação e divisão, incluindo o tratamento de exceções para divisão por zero.

## Estrutura do Projeto

```
aula/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── gladyson/
    │               └── Calculadora.java
    └── test/
        └── java/
            └── com/
                └── gladyson/
                    └── CalculadoraTest.java
```

- [`Calculadora.java`](aula/src/main/java/com/gladyson/Calculadora.java): Implementação da calculadora.
- [`CalculadoraTest.java`](aula/src/test/java/com/gladyson/CalculadoraTest.java): Testes unitários utilizando JUnit 5.

## Como executar os testes

1. Certifique-se de ter o [Maven](https://maven.apache.org/) instalado.
2. No terminal, navegue até a pasta `aula/`.
3. Execute o comando:

```sh
mvn test
```

Os testes serão executados automaticamente e o resultado será exibido no terminal.

## Tecnologias utilizadas

- Java 17
- Maven
- JUnit 5

---

Projeto criado para fins educacionais durante aula de
