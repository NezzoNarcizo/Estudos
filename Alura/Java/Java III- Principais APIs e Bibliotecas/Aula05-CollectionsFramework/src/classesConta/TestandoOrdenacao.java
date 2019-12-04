package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoOrdenacao {
	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca("Lockheed", 600);
		ContaPoupanca cp1 = new ContaPoupanca("Hawk", 500);
		ContaPoupanca cp2 = new ContaPoupanca("Nezzo", 700);
		ContaCorrente cp3 = new ContaCorrente("Marlon", 900);
		ContaCorrente cp4 = new ContaCorrente("Augusto", 1000);
		ContaCorrente cp5 = new ContaCorrente("Narcizo", 800);

		List<Conta> contas = new ArrayList<Conta>(); // Podemos usar tambem o "Operador Diamante" new ArrayList<>();
		contas.add(cp);
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cp3);
		contas.add(cp4);
		contas.add(cp5);
		
		Collections.sort(contas);
		
		for (Conta conta : contas) {
			System.out.println("Nome: " + conta.getNome() + " Saldo: " + conta.getSaldo());
		}
	}
}
