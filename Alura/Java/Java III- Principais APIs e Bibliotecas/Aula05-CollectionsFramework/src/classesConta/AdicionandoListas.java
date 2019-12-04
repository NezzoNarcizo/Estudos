package classesConta;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AdicionandoListas {
	public static void main(String[] args) {

		// Criando Listas para teste de velocidade inserindo na posição 0
		// List<Integer> lista = new ArrayList<>();
		List<Integer> lista = new LinkedList<>();

		// Variável que inicia o cronometro
		long inicio = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			lista.add(0, i);
		}

		// Variavel que encerra o cronometro
		long fim = System.currentTimeMillis();

		// Calculando tempo para inserção em uma ArrayList
		System.out.println("A velocidade desta 'List' para se inserir elementos na primeira posição é: "
				+ (fim - inicio) / 1000.0);

		// A LinkedList gastou 0.004 segundos, enquanto a ArrayList gastou 0.088

		// Utilizando o enhanced for para percorrer a list e verificar o tempo gasto
		inicio = System.currentTimeMillis();
		for (Integer elemento : lista) {
			System.out.println(elemento.intValue());
		}
		fim = System.currentTimeMillis();
		System.out.println("A velocidade desta 'list' para percorrer cada elemento utilizando enhanced for é: "
				+ (fim - inicio) / 1000.0);
		/*
		 * A velocidade para busca de forma sequencial no enhanced for foi o mesmo tanto
		 * para ArrayList quanto para LinkedList
		 */

		// Utilizando o iterator para percorrer a list e verificar o tempo gasto
		inicio = System.currentTimeMillis();
		Iterator<Integer> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Integer aux = iterator.next();
			System.out.println(aux);
		}
		fim = System.currentTimeMillis();
		System.out.println("A velocidade desta 'list' para percorrer cada elemento utilizzando iterator é: "
				+ (fim - inicio) / 1000.0);
		/*
		 * A velocidade para busca de forma sequencial no iterator foi o mesmo tanto
		 * para ArrayList quanto para LinkedList
		 */

		/*
		 * A LinkedList é bem mais rápida para fazer a inserção na primeira posição do
		 * que a ArrayList. Isso é uma característica dos algoritmos dessas listas e
		 * estudada sob o tópico de Análise de algoritmos na literatura.
		 */
	}
}
