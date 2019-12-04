package banco;

public class Conta {
	
	private String nome;
	private String cpf;
	protected double saldo;
	

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
		if(valor > 0 || valor != 0) {
			this.saldo += valor;
			System.out.println("Valor depositado: " + valor);
		} else {
			throw new ValorInvalidoException(valor);
			//throw new IllegalArgumentException("Você tentou depositar um valor incorreto!");
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void saca(double valor) throws Exception{
		if(this.saldo == valor || this.saldo > valor) {
			this.saldo -= valor;
		}else {
			throw new SaldoInsuficienteException(this.saldo);
			//throw new RuntimeException();
		}
	}	
}
