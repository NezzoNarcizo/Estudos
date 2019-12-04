package boasPraticas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestaJavaIO
{
  public TestaJavaIO() {}
  
  
  /*Este exercício/exemplo abaixo inclui a teoria da parte "Pacote java.io", "Criando um novo projeto" e
   *  "Fechando os canais de comunicação"
   * 
   * 
   */
  public static void main(String[] args) throws java.io.IOException
  {
    InputStream is = System.in;
    
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