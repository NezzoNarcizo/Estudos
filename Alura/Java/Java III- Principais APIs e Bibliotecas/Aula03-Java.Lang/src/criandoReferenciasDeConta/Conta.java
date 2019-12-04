package criandoReferenciasDeConta;

public class Conta { 
	private int numero;
  
  public Conta() {}
  
  public boolean equals(Object obj) { 
	  Conta outraConta = (Conta)obj;
   
    return numero == outraConta.numero;
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
  
}