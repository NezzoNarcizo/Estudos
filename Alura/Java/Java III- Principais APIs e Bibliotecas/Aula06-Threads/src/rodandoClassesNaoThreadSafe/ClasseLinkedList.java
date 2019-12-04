package rodandoClassesNaoThreadSafe;

import java.util.LinkedList;

public class ClasseLinkedList implements Runnable {
	private int comeco;
	private int fim;
	private LinkedList<String> mensagens;

	public ClasseLinkedList(int comeco, int fim, LinkedList<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	/*
	 * Essas duas são também classes não thread-safe (LinkedList e HashSet). É comum que percamos registros
	 * com elas também, mas particularmente em alguns casos, o HashSet e a
	 * LinkedList se perdem mais ainda e nunca terminam de executar!
	 */
	public void run() {
		for (int i = comeco; i < fim; i++) {
			mensagens.add("Mensagem " + i);
		}
	}
}