package rodandoClassesNaoThreadSafe;

import java.util.Vector;

public class ClasseVector implements Runnable {
	private int comeco;
	private int fim;
	private Vector<String> mensagens;

	public ClasseVector(int comeco, int fim, Vector<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	/*
	 * Agora, não importa quantas vezes executemos, não tomamos o erro novamente. 
	 * Olhando o método add do Vector notamos que ele é um método synchronized:	  
	 * public synchronized boolean add(E e) {
	 * 
	 * obs: Parece que praticamente todos os métodos dentro de Vector são Synchronized
	 */
	public void run() {
		for (int i = comeco; i < fim; i++) {
			mensagens.add("Mensagem " + i);
		}
	}
}
