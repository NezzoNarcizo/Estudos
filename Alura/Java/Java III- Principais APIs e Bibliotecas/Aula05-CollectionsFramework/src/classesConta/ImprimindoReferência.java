package classesConta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImprimindoReferência {
	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<>();
		Random random = new Random();
		//Outra forma de colocar saldos aleatórios
		for (int i = 0; i < 10; i++) {
			ContaPoupanca cp = new ContaPoupanca("Cliente", random.nextInt(1000) + random.nextDouble());
			contas.add(cp);
		}
		
		int contador = 1;
		for (Conta conta : contas) {
			System.out.println("Cliente: " + contador + "|| Saldo: " + conta.getSaldo());
			contador++;
		}
		
		//Imprimindo a referência para essa lista e verificando se o toString de uma ArrayList/LinkedList é reescrito.
		System.out.println(contas);
		//Sim! Ele mostra os elementos da lista, entre colchetes e separados por vírgulas.
	}
}
