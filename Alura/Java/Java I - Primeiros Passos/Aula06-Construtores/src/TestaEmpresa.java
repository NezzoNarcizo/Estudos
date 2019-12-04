class TestaEmpresa{
	public static void main(String []args){
		
		Funcionario funcionario = new Funcionario("Marlon");
		
		funcionario.setNome("Marlon Augusto");
		funcionario.setCpf("000.000.000-00");
		funcionario.setIdade(29);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getIdade());
		
		Empresa empresa = new Empresa(10);
		System.out.println(empresa.getFuncionarios().length);
	}
}