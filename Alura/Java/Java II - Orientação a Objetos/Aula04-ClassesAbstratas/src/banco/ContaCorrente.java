package banco;

public class ContaCorrente extends Conta{
	
	/*public void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 2);
	}*/
	
	@Override
	public void atualiza(double taxa) {
		atualiza(taxa * 2);
	}

}
