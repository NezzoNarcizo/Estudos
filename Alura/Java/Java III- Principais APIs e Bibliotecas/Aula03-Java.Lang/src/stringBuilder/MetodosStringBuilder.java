package stringBuilder;

public class MetodosStringBuilder { public MetodosStringBuilder() {}
  public static void main(String[] args) { StringBuilder buffer = new StringBuilder("João Silveira Batista");
    System.out.printf(" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + 16(valor inicial padrão)) = %d\n\n", new Object[] {
    
      buffer.toString(), Integer.valueOf(buffer.length()), Integer.valueOf(buffer.length()), Integer.valueOf(buffer.capacity()) });
    

    buffer.ensureCapacity(75);
    System.out.printf("Nova Capacidade = %d\n\n", new Object[] { Integer.valueOf(buffer.capacity()) });
    


    buffer.setLength(10);
    System.out.printf("Novo tamanho = %d\n buffer = %s\n", new Object[] { Integer.valueOf(buffer.length()), 
      buffer.toString() });
  }
}
