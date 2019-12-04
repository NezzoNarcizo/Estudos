package br.com.empresa.banco.conta;

import br.com.empresa.banco.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
  public ContaCorrente() {}
  
  public void atualiza(double taxa) {
    saldo += getSaldo() * taxa * 2.0D;
  }
  
  public double calculaTributos()
  {
    return getSaldo() * 0.01D;
  }
}