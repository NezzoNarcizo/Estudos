package boasPraticas;

import java.io.BufferedReader;

public class BoasPraticas
{
  public BoasPraticas() {}
  //Um pouco mais de Polimorfismo
  /*Qualquer classe que seja um InputStream serve alí. As que a própria API do Java traz consigo são encontradas 
    	na documentação da própria InputStream no campo Direct Known Subclasses.
		AudioInputStream, ByteArrayInputStream, FileInputStream, InputStream (do CORBA), ObjectInputStream, 
		PipedInputStream, SequenceInputStream, StringBufferInputStream, FilterInputStream.

		Essa última, ainda tem suas filhas que, ainda que indiretamente, também são um InputStream. 
		São elas: BufferedInputStream, CheckedInputStream, CipherInputStream, DataInputStream, DeflaterInputStream, 
		DigestInputStream, InflaterInputStream, LineNumberInputStream, ProgressMonitorInputStream, 
		PushbackInputStream.
   
   */
  public static void main(String[] args) throws java.io.IOException
  {
	/*Deixando o código mais curto. Com certeza, legibilidades é mais importante mas o modo abaixo é muito utilizado 
	  e muito comum */
    BufferedReader br = new BufferedReader(
    		new java.io.InputStreamReader(
    				new java.io.FileInputStream("Arquivo.txt")));
    
    String msg = br.readLine();
    while (msg != null) {
      System.out.println(msg);
      msg = br.readLine();
    }
    br.close();
  }
}