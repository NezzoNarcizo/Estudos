package criandoReferenciasDeConta;

public class TestaComparacaoContas { public TestaComparacaoContas() {}
  
  public static void main(String[] args) { ContaCorrente cc = new ContaCorrente();
    ContaCorrente cc1 = new ContaCorrente();
    

    cc.setNumero(1);
    cc1.setNumero(1);
    

    System.out.println(cc.equals(cc1));
    

    Conta c = new Conta();
    

    System.out.println(c.equals(cc, cc1));
  }
}