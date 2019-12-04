package javaLang;

public class TestaInteger { public TestaInteger() {}
  public static void main(String[] args) { Integer x1 = new Integer(10);
    Integer x2 = new Integer(10);
    


    if (x1 == x2) {
      System.out.println("São iguais!");
    } else {
      System.out.println("São diferentes!");
    }
    

    if (x1.equals(x2)) {
      System.out.println("Conteúdos iguais!");
    } else {
      System.out.println("Conteúdos diferentes!");
    }
    

    System.out.println(x2.intValue());
    

    System.out.println(x2.equals(x1));
  }
}
