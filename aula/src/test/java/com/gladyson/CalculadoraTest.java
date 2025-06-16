package com.gladyson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

  @Test
  void testSomar() {
    Calculadora cal = new Calculadora();
    int resultado = cal.somar(2, 3);
    assertEquals(5, resultado, "2 + 3 deve ser 5");
  }

  @Test
  void testSubtracao() {
    Calculadora cal = new Calculadora();
    int resultado = cal.sub(2, 3);
    assertEquals(-1, resultado, "2 - 3 deve ser -1");
  }

  @Test
  void testMultplicacao() {
    Calculadora cal = new Calculadora();
    int resultado = cal.mult(2, 3);
    assertEquals(6, resultado, "2 * 3 deve ser 6");
  }

  @Test
  void testDivisao() {
    Calculadora cal = new Calculadora();
    double resultado = cal.div(4, 2);
    assertEquals(2, resultado, "2 / 4 deve ser 2");
  }

  @Test
  void testDivisaoPorZero() {
    Calculadora cal = new Calculadora();
    assertThrows(IllegalArgumentException.class,
        () -> cal.div(0, 0),
        "Deve lançar o Erro IllegalArgumentException ao dividir por 0.");
  }

}
