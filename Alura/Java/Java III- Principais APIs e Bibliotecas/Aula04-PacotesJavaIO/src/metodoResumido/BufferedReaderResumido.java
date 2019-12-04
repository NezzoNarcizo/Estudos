package metodoResumido;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderResumido
{
  public BufferedReaderResumido() {}
  
  //Este exercicío inclui a parte do "Polimorfismo" lendo de um arquivo ao invés do teclado
  public static void main(String[] args) throws java.io.IOException {
    
	InputStream is = new java.io.FileInputStream("Arquivo.txt");
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    

    java.io.OutputStream os = new FileOutputStream("Saida.txt");
    
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);
    
    String linha = br.readLine();
    while (linha != null) {
      bw.append(linha);
      bw.newLine();
      linha = br.readLine();
    }
    br.close();
    bw.close();
  }
}