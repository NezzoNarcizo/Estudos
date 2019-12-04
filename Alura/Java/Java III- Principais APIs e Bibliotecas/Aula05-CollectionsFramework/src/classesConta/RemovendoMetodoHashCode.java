package classesConta;

import java.util.HashSet;
import java.util.Random;

public class RemovendoMetodoHashCode {
	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<>();
		Random valorAleatorio = new Random();

		Conta cc = new ContaCorrente(1, "Pedro", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc1 = new ContaCorrente(1, "Tiago", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc2 = new ContaCorrente(2, "João", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc3 = new ContaCorrente(2, "André", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc4 = new ContaCorrente(3, "Filipe", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc5 = new ContaCorrente(3, "Bartolomeu", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc6 = new ContaCorrente(4, "Mateus", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc7 = new ContaCorrente(4, "Tomé", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc8 = new ContaCorrente(5, "Segundo Tiago", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc9 = new ContaCorrente(5, "Tadeu", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc10 = new ContaCorrente(6, "Simão", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());
		Conta cc11 = new ContaCorrente(6, "Judas", valorAleatorio.nextInt(1000) + valorAleatorio.nextDouble());

		contas.add(cc);
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cc4);
		contas.add(cc5);
		contas.add(cc6);
		contas.add(cc7);
		contas.add(cc8);
		contas.add(cc9);
		contas.add(cc10);
		contas.add(cc11);

		for (Conta conta : contas) {
			System.out.println(conta.getNome());
		}
		
		System.out.println(contas.size());
	}
}
