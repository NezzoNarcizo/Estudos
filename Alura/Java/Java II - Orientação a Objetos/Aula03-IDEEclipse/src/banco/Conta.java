package banco;

public class Conta {
	
	private String nome;
	private String cpf;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void deposita(double valor) {
		this.saldo = valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	
	public boolean saca(double valor){
		if(this.saldo == valor || this.saldo > valor) {
			return true;
		}else {
			return false;
		}
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
}
