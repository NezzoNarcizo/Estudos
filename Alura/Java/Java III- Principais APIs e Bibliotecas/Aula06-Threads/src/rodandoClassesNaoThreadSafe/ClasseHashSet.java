package rodandoClassesNaoThreadSafe;

import java.util.HashSet;

public class ClasseHashSet implements Runnable {
	private int comeco;
	private int fim;
	private HashSet<String> mensagens;

	public ClasseHashSet(int comeco, int fim, HashSet<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	/*
	 * Essas duas são também classes não thread-safe (LinkedList e HashSet). É comum
	 * que percamos registros com elas também, mas particularmente em alguns casos,
	 * o HashSet e a LinkedList se perdem mais ainda e nunca terminam de executar!
	 */
	public void run() {
		for (int i = comeco; i < fim; i++) {
			mensagens.add("Mensagem " + i);
		}
	}
}
