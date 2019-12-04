package banco;

public class Principal {
	public static void main(String[] args) {

		Conta conta = new Conta();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();

		conta.setNome("Narcizo");
		contaCorrente.setNome("Marlon");
		contaPoupanca.setNome("Augusto");

		conta.deposita(100.0);
		contaCorrente.deposita(100.0);
		contaPoupanca.deposita(100.0);

		System.out.println(conta.getSaldo());
	}
}
