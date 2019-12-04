package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;

public class TestaConta {
  public TestaConta() {}
  
  public static void main(String[] args) {
    Conta joao = new Conta();
    try
    {
      joao.deposita(0.0D);
    } catch (br.com.empresa.banco.conta.ValorInvalidoException e) {
      System.out.println(e.getMessage());
    }
    

    try
    {
      joao.saca(50.0D);
    } catch (br.com.empresa.banco.conta.SaldoInsuficienteException e) {
      System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
    } catch (Exception e) {
      System.out.println("Um outro erro qualquer!");
    }
  }
}
