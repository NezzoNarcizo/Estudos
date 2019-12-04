package banco;

public class ContaPoupanca extends Conta{

	@Override
	void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 3);
	}
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
	
	/*public void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 3);
	}*/
	
	/*public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}*/
}
