class Empresa{
	private String nomeEmpresa;
	private String cnpj;
	private Funcionario[] funcionarios;
	
	public String getNomeEmpresa(){
		return this.nomeEmpresa;
	}
	
	public void setNomeEmpresa(String nomeEmpresa){
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.funcionarios[posicao];
	}
	
	public void setFuncionario(Funcionario funcionario, int posicao){
		this.funcionarios[posicao] = funcionario;
	}
}