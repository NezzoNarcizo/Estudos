package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {
  private double saldoTotal;
  private double selic;
  
  public AtualizadorDeContas(double selic) {
    this.selic = selic;
  }
  
  public void detalhesDasContas(Conta c) {
    System.out.println("====================");
    System.out.println("Saldo Anterior: " + c.getSaldo());
    c.atualiza(selic);
    System.out.println("Saldo Final: " + c.getSaldo());
    saldoTotal += c.getSaldo();
    System.out.println("====================");
  }
  
  public double getSaldoTotal() {
    return saldoTotal;
  }
}