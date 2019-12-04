package comparandoContas;

import refinandoMensagens.RefinandoMensagens;

public class TestaComparacaoContas extends RefinandoMensagens {
  
  public static void main(String[] args) { Conta cc = new Conta();
    Conta cc1 = new Conta();
    

    cc.setNumero(1);
    cc1.setNumero(1);
    
    cc.setNome("Marlon");
    cc1.setNome("Marlon");
    
    cc.setSaldo(714);
    
    //Testando com método Equals() original
    System.out.println(cc.equals(cc1));
    

    Conta c = new Conta();
    
    //Testando com método Equals() sobreescrito
    System.out.println(c.equals(cc, cc1));
    
    //Verificando saldo com uma mensagem mais refinada.
    System.out.println(retornaSaldoConta(cc));
  }
}