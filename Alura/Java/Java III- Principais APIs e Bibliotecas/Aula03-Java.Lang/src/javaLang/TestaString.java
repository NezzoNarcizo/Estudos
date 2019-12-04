package javaLang;

public class TestaString { public TestaString() {}
  
  public static void main(String[] args) { String s = "FJ11";
    s.replaceAll("1", "2");
    

    System.out.println(s);
    
    String x = "teste";
    String y = "teste";
    
    if (x.contentEquals(y)) {
      System.out.println("Strings são iguais!");
    } else {
      System.out.println("Strings não são iguais");
    }
    

    if (x.isEmpty()) {
      System.out.println("String vazia!");
    } else {
      System.out.println("String não está vazia!");
    }

    System.out.println("String x tem " + x.length() + " caracteres.");
    System.out.println("String y tem " + y.length() + " caracteres.");
    







    String a = "testado";
    String b = "Testa";
    

    if (java.util.regex.Pattern.compile(java.util.regex.Pattern.quote(b), 2).matcher(a).find()) {
      System.out.println("A contém B");
    } else {
      System.out.println("A não contém B");
    }
    

    String c = "  Meu nome é ";
    String d = c.trim();
    System.out.println(c);
    System.out.println(d);
  }
}
