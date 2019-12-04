package stringToInt;

public class StringToInt { public StringToInt() {}
  
  public static void main(String[] args) { 
	int resultado = metodo1("762");
    System.out.println(resultado);
    
    /* Abaixo uma tentativa de converter uma String com um caractere inválido (A) para Int.
    int resultado2 = metodo1("762A");
    System.out.println(resultado2);
    */
    
    String numero = "762";
    int resultado3 = metodo2(numero);
    System.out.println(resultado3);
  }
  

  public static int metodo1(String x)
  {
    int num = Integer.parseInt(x);
    return num;
  }
  
  public static int metodo2(String numero)
  {
    int resultado = 0;
    while (numero.length() > 0) {
      char algarismo = numero.charAt(0);
      resultado = resultado * 10 + (algarismo - '0');
      numero = numero.substring(1);
    }
    return resultado;
  }
}