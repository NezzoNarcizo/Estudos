package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class Principal
{
  public Principal() {}
  
  public static void main(String[] args) {
    Conta conta = new ContaCorrente();
    ContaCorrente contaCorrente = new ContaCorrente();
    br.com.empresa.banco.conta.ContaPoupanca contaPoupanca = new br.com.empresa.banco.conta.ContaPoupanca();
    
    conta.setNome("Narcizo");
    contaCorrente.setNome("Marlon");
    contaPoupanca.setNome("Augusto");
    
    conta.deposita(100.0D);
    contaCorrente.deposita(100.0D);
    contaPoupanca.deposita(100.0D);
    
    conta.atualiza(0.01D);
    contaCorrente.atualiza(0.01D);
    contaPoupanca.atualiza(0.01D);
    
    conta.setCpf("000.000.000-00");
    
    System.out.println(conta.toString());
    
    System.out.printf("O saldo é: %.2f\n", new Object[] { Double.valueOf(conta.getSaldo()) });
    System.out.printf("O saldo é: %.2f\n", new Object[] { Double.valueOf(contaCorrente.getSaldo()) });
    System.out.printf("O saldo é: %.2f\n", new Object[] { Double.valueOf(contaPoupanca.getSaldo()) });
  }
}
