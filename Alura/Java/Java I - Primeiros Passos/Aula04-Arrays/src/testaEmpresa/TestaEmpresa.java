package testaEmpresa;

class Funcionario{
	String nome;
	double salario;
	String cpf;
}


class Empresa{
	String nome;
	Funcionario[] empregados;
    String cnpj;
	int livre = 0;
	
	void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }
	
	
	void mostraEmpregadosEmpresa(){
		int contador = 0;
		System.out.println("Funcionarios da Empresa: "+this.nome);
		while(this.empregados[contador] != null){
			System.out.println("");
			System.out.println("Nome: "+this.empregados[contador].nome);
			System.out.println("CPF: "+this.empregados[contador].cpf);
			System.out.println("Salario: "+this.empregados[contador].salario);
			System.out.println("");
			contador++;
		}
	}
	
	boolean verificaFuncionario(Funcionario empregado){
		for(int i = 0; i < this.empregados.length; i++){
			if(this.empregados[i] == empregado){
				return true;
			}			
		}
		return false;
	}
}
	

class TestaEmpresa{	
	public static void main (String []args){
		Funcionario empregado = new Funcionario();
		empregado.nome = "Marlon";
		empregado.salario = 2400;
		empregado.cpf = "000.000.000-00";
		
		Funcionario empregado2 = new Funcionario();
		empregado2.nome = "Augusto";
		empregado2.salario = 2300;
		empregado2.cpf = "000.000.000-03";
		
		Funcionario empregado3 = new Funcionario();
		empregado3.nome = "Narcizo";
		empregado3.salario = 2200;
		empregado3.cpf = "000.000.000-04";
		
		Empresa empresa = new Empresa();
		empresa.nome = "CTIS";
		empresa.cnpj = "000.000.000-01";
		empresa.empregados = new Funcionario[10];
		
		empresa.adiciona(empregado);
		empresa.adiciona(empregado2);
		empresa.adiciona(empregado3);
		
		if(empresa.verificaFuncionario(empregado3)){
			System.out.println("Funcionario existe!");
		} else {
			System.out.println("Funcionario nao existe!");
		}
		
		empresa.mostraEmpregadosEmpresa();
	}
}