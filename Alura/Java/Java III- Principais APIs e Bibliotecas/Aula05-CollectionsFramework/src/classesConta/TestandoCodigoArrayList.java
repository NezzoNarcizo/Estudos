package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoCodigoArrayList {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		// Criando um for para adicionar números de 1 a 1000 na ArrayList
		for (int i = 0; i <= 1000; i++) {
			numeros.add(i);
		}

		//Invertendo a ArrayList
		Collections.reverse(numeros);
		
		// Criando um for para percorrer a ArrayList
		for (Integer integer : numeros) {
			System.out.println(integer + " ");
		}
	}
}
