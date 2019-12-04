package banco;

public class ContaCorrente extends Conta{
	
	/*public void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 2);
	}*/
	
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
}
