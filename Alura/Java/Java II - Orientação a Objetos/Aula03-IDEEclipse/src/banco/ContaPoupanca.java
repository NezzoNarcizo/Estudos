package banco;

public class ContaPoupanca extends Conta{
	
	/*public void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 3);
	}*/
	
	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}
}
