package classesConta;

import java.util.LinkedList;
import java.util.List;

public class TrocaEntreListas {
	public static void main(String[] args) {
		// Realizaremos uma troca de Listas
		ContaPoupanca cp = new ContaPoupanca("Lockheed", 700);
		ContaPoupanca cp1 = new ContaPoupanca("Hawk", 600);
		ContaPoupanca cp2 = new ContaPoupanca("Nezzo", 500);

		ContaCorrente cc = new ContaCorrente("Marlon", 1000);
		ContaCorrente cc1 = new ContaCorrente("Augusto", 900);
		ContaCorrente cc2 = new ContaCorrente("Narcizo", 800);

		/*
		 * Em vez de utilizarmos "ArrayList" utilizaremos "LinkedList" Podemos percerber
		 * que só trocamos o trecho após "new", "Array" por "Linked" e adicionamos o
		 * import do "java.util.LinkedList
		 */
		List<Conta> contas = new LinkedList<Conta>(); // Podemos usar tambem o "Operador Diamante" new ArrayList<>();
		contas.add(cp);
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cc);
		contas.add(cc1);
		contas.add(cc2);

		for (int i = 0; i < contas.size(); i++) {
			System.out.println("Nome: " + contas.get(i).getNome() + " || Saldo: " + contas.get(i).getSaldo());
		}

		/*
		 * Essa mudança simplesmente funciona! O legal de chamar as coleções pelas suas
		 * interfaces é isso: não importa a implementação. Como ambas são uma List, é
		 * possível trocar entre elas e continuar tratando como List.
		 * 
		 * É mais uma aplicação do polimorfismo!
		 */
	}
}
