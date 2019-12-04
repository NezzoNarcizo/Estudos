package comparandoContas;

public class Conta { private int numero;
  private String nome;
  private double saldo;
  
  public Conta() {}
  
  public String getNome() { return nome; }
  
  public void setNome(String nome)
  {
    this.nome = nome;
  }
  
  //Exercício considerando as Strings também está incluído aqui na parte que considera o nome na função equals()
  public boolean equals(Object obj) {
    Conta outraConta = (Conta)obj;
    
    return (numero == outraConta.numero) && (nome.equals(outraConta.nome));
  }

  public boolean equals(Object obj, Object obj1)
  {
    return obj == obj1;
  }
  
  public int getNumero() {
    return numero;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

}