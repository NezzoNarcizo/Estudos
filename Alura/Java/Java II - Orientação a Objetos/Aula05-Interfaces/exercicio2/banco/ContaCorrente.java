package banco;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 2);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
	/*public void atualiza(double taxa) {
	this.deposita(this.getSaldo() * taxa * 2);
	}*/

}
