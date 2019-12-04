package br.com.empresa.banco.conta;

public class SaldoInsuficienteException
  extends RuntimeException
{
  private static final long serialVersionUID = 1L;
  private final double saldoAtual;
  
  public SaldoInsuficienteException(double saldoAtual)
  {
    super("Saldo Insuficiente: " + saldoAtual);
    this.saldoAtual = saldoAtual;
  }
  
  public double getSaldoAtual() {
    return saldoAtual;
  }
}