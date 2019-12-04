package classesConta;

import java.util.TreeSet;

public class TestandoCodigoTreeSet {
	public static void main(String[] args) {
		// Criando váriavel TreeSet
		TreeSet<Integer> numeros = new TreeSet<>();

		// Criando for para adicionar os itens a TreeSet
		for (int i = 0; i <= 1000; i++) {
			numeros.add(i);
		}

		// Criando for para percorrer de forma invertida a TreeSet
		for (Integer integer : numeros.descendingSet()) {
			System.out.println(integer + " ");
		}
	}
}
