package br.com.empresa.banco;

public class GerenciadorDeImpostoDeRenda { public GerenciadorDeImpostoDeRenda() {}
  
  public double getTotal() { return total; }
  
  private double total;
  void adiciona(Tributavel t) {
    System.out.println("Adicionando tributavel: " + t);
    
    total += t.calculaTributos();
  }
}