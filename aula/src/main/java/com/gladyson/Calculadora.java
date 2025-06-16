package com.gladyson;

public class Calculadora {

  public int somar(int a, int b) {
    return (a + b);
  }

  public int sub(int a, int b) {
    return (a - b);
  }

  public int mult(int a, int b) {
    return (a * b);
  }

  public double div(int a, int b) {
    if (a == 0)
      throw new IllegalArgumentException("Não poder ter divisão por 0");
    return (a / b);
  }
}