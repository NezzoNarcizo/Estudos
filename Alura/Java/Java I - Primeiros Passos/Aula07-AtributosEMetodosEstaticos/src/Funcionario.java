class Funcionario{
	private int identificador;
	private String nome;
	private String cpf;
	private int idade;
	private static int identificadorAtual = 1;
	
	
	public static int getIdentificadorAtual(){
		return identificadorAtual;
	}
	
	public Funcionario(){
		this.identificador = this.identificadorAtual;
		this.identificadorAtual++;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
		this.identificador = this.identificadorAtual;
		this.identificadorAtual++;
	}
	
	public int getIdentificador(){
		return this.identificador;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
}