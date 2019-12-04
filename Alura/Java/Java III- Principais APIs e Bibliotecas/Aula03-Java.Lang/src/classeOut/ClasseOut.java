package classeOut;

import java.io.PrintStream;

public class ClasseOut {
	public static void main(String[] args) {
		String teste = "Descobrindo à que classe pertence o objeto OUT";
		
		PrintStream saida = System.out;
		saida.println(teste);
		
		//Podemos perceber que o "System.out" pertence a classe PrintStream
	}
}
