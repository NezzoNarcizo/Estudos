package classesConta;

public class ContaCorrente extends Conta {

	/*
	 * Método que chama o construtor de conta que gera o número da conta
	 * automaticamente
	 */
	public ContaCorrente(String nome, double saldo) {
		super(nome, saldo, "CC");
		// TODO Auto-generated constructor stub
	}

	/*
	 * Método que chama o construtor de conta que gera o número da conta de forma
	 * manual
	 */
	public ContaCorrente(int numero, String nome, double saldo) {
		super(numero, nome, saldo, "CC");
		// TODO Auto-generated constructor stub
	}
}
