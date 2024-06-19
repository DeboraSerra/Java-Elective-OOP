package com.trybe.acc.contapoupanca;

/**
 * The type Conta poupanca.
 */
public class ContaPoupanca {
  private  double saldo;
  private final String titularConta;

  /**
   * Instantiates a new Conta poupanca.
   *
   * @param titularConta the titular conta
   * @param saldo        the saldo
   */
  public ContaPoupanca(String titularConta, double saldo) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }

  /**
   * Depositar.
   *
   * @param value the value
   */
  public void depositar(double value) {
    saldo += value;
  }

  /**
   * Sacar.
   *
   * @param value the value
   */
  public void sacar(double value) {
    saldo -= value;
  }

  /**
   * Mostrar saldo double.
   *
   * @return the double
   */
  public double mostrarSaldo() {
    return saldo;
  }

  /**
   * Mostrar titular conta string.
   *
   * @return the string
   */
  public  String mostrarTitularConta() {
    return titularConta;
  }

}
