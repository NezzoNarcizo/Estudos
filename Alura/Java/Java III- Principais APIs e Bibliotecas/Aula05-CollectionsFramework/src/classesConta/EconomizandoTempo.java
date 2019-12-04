package classesConta;

import java.util.Collection;
import java.util.HashSet;

public class EconomizandoTempo {
	public static void main(String[] args) {
		System.out.println("Iniciando...");

		// Collection<Integer> teste = new ArrayList<>();
		// Utilizando ArrayList() gastamos 334 milissegundos (Calculando o tempo total
		// entre inserção e pesquisa)

		Collection<Integer> teste = new HashSet<>();
		// Utilizando HashSet() gastamos 10 milissegundos (Calculando o tempo total
		// entre inserção e pesquisa)

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			teste.add(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto na inserção da Collection: " + tempo);

		inicio = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			teste.contains(i);
		}

		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto na pesquisa da Collection: " + tempo);

		/*
		 * Calculando de forma separada o HashSet gastou 8 milissegundos na inserção de
		 * dados e 4 milissegundos na pesquisa, enquanto que com ArrayList gastou 2
		 * milissegundos para inserção e 328 milissegundos para pesquisa.
		 */

		/*
		 * O que é lento? A inserção de 30 mil elementos ou as 30 mil buscas? Descubra
		 * computando o tempo gasto em cada for separadamente.
		 * 
		 * A diferença é mais que gritante. Se você passar de 30 mil para um número
		 * maior, como 50 ou 100 mil, verá que isso inviabiliza por completo o uso de
		 * uma List, no caso em que queremos utilizá-la essencialmente em pesquisas.
		 * 
		 * 
		 * No caso das listas (ArrayList e LinkedList), a inserção é bem rápida e a
		 * busca muito lenta!
		 * 
		 * No caso dos conjuntos (TreeSet e HashSet), a inserção ainda é rápida, embora
		 * um pouco mais lenta do que a das listas. E a busca é muito rápida!
		 */
	}
}
