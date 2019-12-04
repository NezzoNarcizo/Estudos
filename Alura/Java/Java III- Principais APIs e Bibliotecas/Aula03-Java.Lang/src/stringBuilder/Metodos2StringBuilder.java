package stringBuilder;

public class Metodos2StringBuilder { public Metodos2StringBuilder() {}
  public static void main(String[] args) { StringBuilder buffer = new StringBuilder("Usando outros métodos StringBuilder");
    
    System.out.printf("buffer = %s\n", new Object[] { buffer.toString() });
    
    System.out.printf("Caractere index 0: %s\nCaractere index 4: %s\n\n", new Object[] {
      Character.valueOf(buffer.charAt(0)), Character.valueOf(buffer.charAt(4)) });
    
    char[] charArray = new char[buffer.length()];
    
    buffer.getChars(0, buffer.length(), charArray, 0);
    System.out.print("Os caracteres são: ");
    
    for (char c : charArray) { System.out.print(c);
    }
    buffer.setCharAt(0, 'O');
    buffer.setCharAt(4, 'P');
    
    System.out.printf("\n\nbuffer = %s", new Object[] { buffer.toString() });
    


    buffer.reverse();
    System.out.printf("\n\nbuffer = %s\n", new Object[] { buffer.toString() });
  }
  





  public void inverteComStringBuilder(String texto)
  {
    System.out.print("\t");
    StringBuilder invertido = new StringBuilder(texto).reverse();
    System.out.println(invertido);
  }
}
