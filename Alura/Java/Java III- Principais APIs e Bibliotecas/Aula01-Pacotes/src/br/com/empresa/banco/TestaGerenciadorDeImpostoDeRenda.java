package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaGerenciadorDeImpostoDeRenda
{
  public TestaGerenciadorDeImpostoDeRenda() {}
  
  public static void main(String[] args)
  {
    GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
    

    SeguroDeVida sv = new SeguroDeVida();
    

    gerenciador.adiciona(sv);
    

    ContaCorrente cc = new br.com.empresa.banco.conta.ContaCorrente();
    cc.deposita(1000.0D);
    

    gerenciador.adiciona(cc);
    

    System.out.println(gerenciador.getTotal());
    

    Conta cp = new ContaPoupanca();
    cp.deposita(100.0D);
    cp.atualiza(0.01D);
    
    System.out.println("O saldo é: " + cp.getSaldo());
    System.out.printf("O saldo é: %.2f\n", new Object[] { Double.valueOf(cp.getSaldo()) });
  }
}
