class TestaEmpresa{
	public static void main(String []args){
		
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Marlon");
		funcionario.setCpf("000.000.000-00");
		funcionario.setIdade(29);
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Narcizo");
		funcionario1.setCpf("000.000.000-01");
		funcionario1.setIdade(30);
		
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setNome("Augusto");
		funcionario2.setCpf("000.000.000-02");
		funcionario2.setIdade(31);
		
		
		System.out.println(funcionario.getIdentificador());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getIdade());
		
		System.out.println("");
		
		System.out.println(funcionario1.getIdentificador());
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getCpf());
		System.out.println(funcionario1.getIdade());
		
		System.out.println("");
		
		System.out.println(funcionario2.getIdentificador());
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getCpf());
		System.out.println(funcionario2.getIdade());
		
		System.out.println("");
		
		System.out.println("Identificador Atual: "+Funcionario.getIdentificadorAtual());		
	}
}