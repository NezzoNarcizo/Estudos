package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InvertendoOrdemListas {
	public static void main(String[] args) {

		List<String> frutas = new ArrayList<>();

		// Teste com uma lista um "pouquinho" grande kkk
		frutas.add("Laranja");
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Pera");
		frutas.add("Melancia");
		frutas.add("Uva");
		frutas.add("Quiui");
		frutas.add("Cupuaçu");
		frutas.add("Abacaxi");
		frutas.add("Goiaba");
		frutas.add("Ameixa");
		frutas.add("Coco");
		frutas.add("Amora");
		frutas.add("Jabuticaba");
		frutas.add("Pessego");
		frutas.add("Limão");
		frutas.add("Morango");
		frutas.add("Jaca");
		frutas.add("Jatobá");
		frutas.add("Carambola");
		frutas.add("Açaí");
		frutas.add("Guaraná");
		frutas.add("Acerola");
		frutas.add("Manga");
		frutas.add("Caju");
		frutas.add("Ingá");
		frutas.add("Siriguela");
		frutas.add("Abacate");
		frutas.add("Romã");
		frutas.add("Pitanga");
		frutas.add("Mamão");
		frutas.add("Maracujá");
		frutas.add("Melão");
		frutas.add("Pinha");
		frutas.add("Cereja");
		frutas.add("Tangerina");
		frutas.add("Mexerica");
		frutas.add("Poncã");

		// Imprimindo itens da Collection na ordem que foram adicionados
		// System.out.println(frutas);

		// Organizando os itens da Lista. Como é uma Collection de Strings o
		// "compareTo()" já existente na classe "String" vai organizar em ordem
		// alfabética
		Collections.sort(frutas);
		System.out.println("Imprimindo Collection em ordem alfabética: " + frutas);

		// Embaralhando a ordem da Lista novamente
		Collections.shuffle(frutas);
		System.out.println("Imprimindo Collection em ordem aleatória: " + frutas);

		// Invertendo a ordem da Collection
		Collections.sort(frutas);
		Collections.reverse(frutas);
		System.out.println("Imprimindo Collection em ordem invertida: " + frutas);

		// Agora utilizaremos o método "reverseOrder()"

		// Criando um objeto "LinkedList"
		LinkedList<Integer> list = new LinkedList<Integer>();

		// populate the list
		list.add(-28);
		list.add(20);
		list.add(-12);
		list.add(8);

		// Criando um "Comparator" para a ordem reversa
		Comparator<Integer> cmp = Collections.reverseOrder();

		// Organizando a Lista
		Collections.sort(list, cmp);

		System.out.println("Lista Organizada na Ordem Reversa: ");
		for (int i : list) {
			System.out.println(i + " ");
		}

		/*
		 * Rotacionando a Lista Com este método escolhemos pelo indice (index) a partir
		 * de qual item rotacionaremos Exemplo lista(t, a, n, k, s), para *rotate(lista,
		 * -4) ou rotate(list, 1), teremos lista(s, t, a, n, k)
		 * 
		 * No exemplo abaixo (com -3) rotacionamos a lista de forma que os 3 primeiros
		 * elementos foram para o final da Lista
		 */
		List<String> objetos = new ArrayList<>();
		objetos.add("Apagador");
		objetos.add("Borracha");
		objetos.add("Caneta");
		objetos.add("Dado");
		objetos.add("Escada");
		objetos.add("Ferro");
		objetos.add("Garfo");
		Collections.rotate(objetos, -3);
		System.out.println("Imprimindo Collection Rotacionada: " + objetos);

		/*
		 * Resumidamente...
		 * 
		 * reverse(List<?> list) - Inverte a ordem dos elementos em uma lista
		 * específica. 
		 * 
		 * rotate(List<?> list, int distance) - Rotaciona os elementos de
		 * uma lista específica a uma distância específica. 
		 * 
		 * shuffle(List<?> list) -
		 * Troca aleatoriamente a lista específica usando um código padrão de
		 * aleatoriedade.
		 * 
		 */
	}
}
