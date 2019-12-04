package polimorfismoScanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPolimorfismo {
  public ScannerPolimorfismo() {}
  
  // Exercício "Continuando com Polimorfismo", "Deixando o código resumido" e "Pequenos ajustes no programa"
  // Também um exemplo de saída dupla, no console e no arquivo
  public static void main(String[] args) throws java.io.IOException {
	  
    //InputStream is = System.in; // ou podemos usar o new 
	InputStream is = new FileInputStream("saida.txt");
    Scanner entrada = new Scanner(is);
    
    //Delimitando que caracter sera o fim da linha
    entrada.useDelimiter("n");
    /* Pelo que pude observar se usarmos o pipe ele separa caracter por caracter, não sei se é porque o pipe 
    	representa o "salto" de caracter para caracter */
    
    
    //Método "useDelimiter" da classe Scanner
    Scanner scanner = new Scanner("a1,b2,c3,d4,e5,f6");
    scanner.useDelimiter("\\d,?");
    
    PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
    
    System.out.println("Digite sua mensagem:");
   
  
    while (entrada.hasNext()) {
    	//System.out.println(entrada.nextLine()); Imprimindo no Console
	    /*A diferença entre next() e nextLine() é que no primeiro ele analisara caracter por caracter para imprimir
    	 já no segundo ele imprimira a linha inteira*/
    	String x = entrada.next(); //Imprimindo no Arquivo
	    saida.println(x);
    }
 
    saida.close();
    entrada.close();
    scanner.close();
    
  }
}