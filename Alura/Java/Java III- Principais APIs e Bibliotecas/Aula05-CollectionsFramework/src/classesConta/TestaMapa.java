package classesConta;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) {

		Conta c = new ContaCorrente("Marlon", 250);
		Conta c1 = new ContaCorrente("Augusto", 500);
		Conta c2 = new ContaPoupanca("Nezzo", 750);
		Conta c3 = new ContaPoupanca("Narcizo", 1000);

		/*
		 * Criando o Mapa Se criarmos o Map sem <parâmetro, parâmetro> ele emitirá um
		 * alerta para definirmos os tipos no mapeamento. No crtl + 1 a opção
		 * selecionada deve ser "Add Type Arguments to Map" e
		 * "Add type arguments to HashMap".
		 */
		Map<String, Object> mapaDeContas = new HashMap<>();

		// Adicionando chaves e valores
		mapaDeContas.put("PrimeiroNome", c);
		mapaDeContas.put("SegundoNome", c1);
		mapaDeContas.put("PrimeiroSobrenome", c2);
		mapaDeContas.put("SegundoSobrenome", c3);

		// Qual o saldo da Conta com o PrimeiroSobrenome?
		Conta primeiroSobrenome = (Conta) mapaDeContas.get("PrimeiroSobrenome");
		System.out.println("O saldo está de acordo com o mapeamento? Saldo: " + primeiroSobrenome.getSaldo());

	}
}
