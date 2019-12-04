package br.com.empresa.banco.conta;

public class Conta {
  private String nome;
  private String cpf;
  protected double saldo;
  
  public Conta() {}
  
  public void atualiza(double taxa) { atualiza(taxa); }
  
  public String getNome()
  {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  public void deposita(double valor) {
    if ((valor > 0.0D) || (valor != 0.0D)) {
      saldo += valor;
      System.out.println("Valor depositado: " + valor);
    } else {
      throw new ValorInvalidoException(valor);
    }
  }
  
  public double getSaldo()
  {
    return saldo;
  }
  




  public void saca(double valor)
    throws Exception
  {
    if ((saldo == valor) || (saldo > valor)) {
      saldo -= valor;
    } else {
      throw new SaldoInsuficienteException(saldo);
    }
  }
  

  public String toString()
  {
    return 
      "Este é um objeto da classe " + getClass() + " que tem saldo de " + getSaldo() + " no nome de " + getNome() + " CPF: " + getCpf();
  }
}
