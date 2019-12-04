package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImplementandoNovaInterface {
	public static void main(String[] args) {

		ContaPoupanca cp = new ContaPoupanca("Lockheed", 700);
		ContaPoupanca cp1 = new ContaPoupanca("Hawk", 600);
		ContaPoupanca cp2 = new ContaPoupanca("Nezzo", 500);

		ContaCorrente cc = new ContaCorrente("Marlon", 1000);
		ContaCorrente cc1 = new ContaCorrente("Augusto", 900);
		ContaCorrente cc2 = new ContaCorrente("Narcizo", 800);

		/*
		 * Utilizamos o modo mais genérico de List e criamos uma collection de contas.
		 * Note que colocamos tanto os objetos de conta corrente como de conta poupança
		 * dentro da mesma collection. É importante fazer o cast na hora de criar a list
		 * para que não tenhamos problemas com vários tipos de objetos ou variáveis.
		 * Assim o nossa collection só aceitara tipos genéricos daqueles pré
		 * determinados.
		 */

		List<Conta> contas = new ArrayList<Conta>(); // Podemos usar tambem o "Operador Diamante" new ArrayList<>();
		contas.add(cp);
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cc);
		contas.add(cc1);
		contas.add(cc2);

		/*
		 * Para saber quantos elementos existem dentro da Lista utilizamos o método
		 * .size().
		 */
		System.out.println(contas.size());

		/*
		 * Iterando com os itens da lista com um for.
		 */
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i));
		}

		/*
		 * Obtendo o valor do saldo de cada conta. Como list trabalha com o tipo object
		 * temos que fazer o cast. Note que a ordem dos elementos não é alterada.
		 */
		for (int i = 0; i < contas.size(); i++) {
			Conta c = contas.get(i); /*
										 * Sem casting porque nossa ArrayList foi pre-definida pra receber só objetos do
										 * tipo conta, mas se precisasse de cast era só colocar (Conta) contas.get(i)
										 */
			System.out.println(c.getSaldo());
		}

		/*
		 * Podemos remover um objeto da List com remove() ou verificar se existe
		 * determinado elemento com o método contains().
		 * 
		 * Primeiro removeremos a cc (Conta Corrente).
		 */
		System.out.println(contas.remove(3));

		// Aqui verificamos se ela foi mesmo removida.
		System.out.println(contas.contains(cc1));

		// Imprimindo de forma ordenada com o método sort().
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");

		// repare que o toString de ArrayList foi sobrescrito:
		// System.out.println(lista);

		Collections.sort(lista);

		System.out.println(lista);

		/*
		 * Logo abaixo estamos usando o método implementado na Classe Conta, compareTo()
		 * O corpo do método é alterado conforme a vontade do programador para utilizar
		 * qualquer atributo para comparação, seja um, sejam vários.
		 */
		System.out.println(cc.compareTo(cp));

	}
}
