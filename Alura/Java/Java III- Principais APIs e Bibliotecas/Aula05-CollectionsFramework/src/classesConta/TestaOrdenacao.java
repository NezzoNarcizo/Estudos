package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {
	public static <T> void main(String[] args) {

		ContaPoupanca cp = new ContaPoupanca("Lockheed", 700);
		ContaPoupanca cp1 = new ContaPoupanca("Hawk", 600);
		ContaPoupanca cp2 = new ContaPoupanca("Nezzo", 500);

		ContaCorrente cc = new ContaCorrente("Marlon", 1000);
		ContaCorrente cc1 = new ContaCorrente("Augusto", 900);
		ContaCorrente cc2 = new ContaCorrente("Narcizo", 800);

		List<Conta> contas = new ArrayList<Conta>(); // Podemos usar tambem o "Operador Diamante" new ArrayList<>();
		contas.add(cp);
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cc);
		contas.add(cc1);
		contas.add(cc2);
		/*
		 * Agora utilizaremos o método sort() para verificar se a ordem se dará pelo
		 * saldo como definino no método compareTo().
		 */

		/*
		 * Observação: Se tentarmos usar o método "sort()" com o tipo "Contas" ou objeto
		 * qualquer que não seja primitivo sem implementar o "Comparable<Object>", ele
		 * não vai identificar o método compareTo() mesmo que ele esteja declarado
		 * dentro da sua classe, pois a interface é como um contrato e sem "assiná-lo" a
		 * existência do método é só uma coincidência e não dá a certeza para a JVM de
		 * que a intenção era mesmo assinar aquele contrato. Tipos primitivos já tem o
		 * "compareTo" por padrão dentro de suas classes, eles já implementam por padrão
		 * o "comparable", por isso podemos usar o metodo sort() sem problemas se
		 * tivermos uma Collection de seu tipo. E se não sobreescrevermos o método
		 * estruturando para comparar com um atributo desejado, no Máximo irá imprimir
		 * os objetos na ordem que foram adicionados.
		 */

		Collections.sort(contas);
		// Looping de repetição para pegar o identificador e saldo da conta.
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getSaldo());
		}

		/*
		 * Podemos reparar que ele ordenou corretamente pelo atributo que utilizamos no
		 * método compareTo().
		 *
		 */

		// Collection de String utilizando o método sort() que chama o compareTo() já
		// implementado na classe String
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");

		Collections.sort(lista);
		System.out.println(lista);

		// Collection de Integer utilizando o método sort() que chama o compareTo() já
		// implementado na classe Integer
		List<Integer> listaNumeros = new ArrayList<>(); // Operador Diamante "<>()".
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(1);

		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
	}
}
