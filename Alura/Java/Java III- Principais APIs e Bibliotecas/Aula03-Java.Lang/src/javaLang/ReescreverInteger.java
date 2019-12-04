package javaLang;

import java.io.PrintStream;

public class ReescreverInteger { public ReescreverInteger() {}
  
  public static void main(String[] args) { Integer x = Integer.valueOf(123);
    String y = x.toString();
    int z = Integer.parseInt(y);
    
    z += 2;
    System.out.println(z);
    System.out.println(y.length());
    

    PrintStream saida = System.out;
    String a = "abcde";
    saida.println(Integer.parseInt(a));
  }
}