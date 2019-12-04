package classeScanner;

import java.util.Scanner;

public class AjusteClasseScanner
{
  public AjusteClasseScanner() {}
  
  public static void main(String[] args) throws java.io.IOException {
    Scanner entrada = new Scanner(System.in);
    java.io.PrintStream saida = new java.io.PrintStream(new java.io.FileOutputStream("Copia.txt"));
    
    while (entrada.hasNextLine()) {
      saida.println(entrada.nextLine());
    }
    entrada.close();
    saida.close();
  }
}