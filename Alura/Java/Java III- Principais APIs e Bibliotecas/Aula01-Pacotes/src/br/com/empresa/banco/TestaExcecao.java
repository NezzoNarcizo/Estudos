package br.com.empresa.banco;

public class TestaExcecao { public TestaExcecao() {}
  public static void main(String[] args) { System.out.println("Inicio main!");
    try {
      m1();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Problema!");
    }
    System.out.println("Fim main!");
  }
  
  private static void m1() {
    System.out.println("Inicio m1!");
    m2();
    System.out.println("Fim m1!");
  }
  
  private static void m2() {
    System.out.println("Inicio m2!");
    int[] nums = new int[10];
    for (int i = 0; i < 15; i++) {
      nums[i] = i;
      System.out.println(nums[i]);
    }
    System.out.println("Fim m2!");
  }
}