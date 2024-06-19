package com.trybe.acc.contapoupanca;

public class ContaPoupanca {
  private  double saldo;
  private String titularConta;

  public ContaPoupanca(String titularConta, double saldo) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }

  public void depositar(double value) {
  saldo += value;
}

public void sacar(double value) {
  saldo -= value;
}

public double mostrarSaldo() {
  return saldo;
}
  public  String mostrarTitularConta() {
  return titularConta;
  }

}
