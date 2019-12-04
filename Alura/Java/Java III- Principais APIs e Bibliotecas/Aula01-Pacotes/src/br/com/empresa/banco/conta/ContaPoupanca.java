package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta { public ContaPoupanca() {}
  
  public void atualiza(double taxa) { saldo += getSaldo() * taxa * 3.0D; }
  
  public void deposita(double valor)
  {
    saldo += valor - 0.1D;
    System.out.println("Valor depositado: " + valor);
  }
}