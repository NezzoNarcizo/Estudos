package classesConta;

public class ContaPoupanca extends Conta {

	/*
	 * Método que chama o construtor de conta que gera o número da conta
	 * automaticamente
	 *
	 */
	public ContaPoupanca(String nome, double saldo) {
		super(nome, saldo, "CP");
		// TODO Auto-generated constructor stub
	}

	/*
	 * Método que chama o construtor de conta que gera o número da conta de forma
	 * manual
	 */
	public ContaPoupanca(int numero, String nome, double saldo) {
		super(numero, nome, saldo, "CP");
	}
}
