package br.com.empresa.banco;

public class TestaError { private static String[] sses;
  
  public TestaError() {}
  
  public static void main(String[] args) { setSses(new String[Integer.MAX_VALUE]); }
  
  public static String[] getSses()
  {
    return sses;
  }
  
  public static void setSses(String[] sses) {
    TestaError.sses = sses;
  }
}
