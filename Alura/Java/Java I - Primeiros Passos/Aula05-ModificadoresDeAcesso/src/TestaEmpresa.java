class TestaEmpresa{
	public static void main(String []args){
		
		//Funcionario funcionario = new Funcionario("Marlon");
		
		Funcionario funcionario = new Funcionario();
		
		
		funcionario.setNome("Marlon Augusto");
		funcionario.setCpf("000.000.000-00");
		funcionario.setIdade(30);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getIdade());
	}
}