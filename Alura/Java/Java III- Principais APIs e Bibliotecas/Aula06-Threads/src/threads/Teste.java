package threads;

public class Teste {
	public static void main(String[] args) {
		
		Programa programa = new Programa();
		programa.setId(1);
		//Criando a thread referente ao objeto da Classe programa
		Thread threadPrograma = new Thread(programa); 
		threadPrograma.start();
		
		
		Programa programa1 = new Programa();
		programa1.setId(2);
		Thread threadPrograma1 = new Thread(programa1);
		threadPrograma1.start();
	}
}
