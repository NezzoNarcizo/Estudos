package threads;

/*
 * Exercício:
 * 		Alternando as Threads: O ponto em que as threads são alternadas o resultado varia 
 * 		(não temos controle sobre isso).
 */

public class Programa implements Runnable {

	private int id;

	public void run() {
		for (int i = 0; i < +10000; i++) {
			System.out.println("Programa: " + id + " Valor: " + i);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
