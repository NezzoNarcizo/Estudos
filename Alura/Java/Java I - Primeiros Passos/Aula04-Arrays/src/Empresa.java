import java.util.ArrayList;

class Funcionario{
	String nome;
	double salario;
	String cpf;
}


class Empresa{
	String nome;
	ArrayList<Funcionario> empregados = new ArrayList<Funcionario>();
    String cnpj;
	int livre = 0;
	
    void adiciona(Funcionario f) {
        this.empregados.add(f);
        this.livre++;
    }
	
	void mostraEmpregadosEmpresa(){
		int contador = 0;
		while(empregados.size() > contador){
			System.out.println(this.empregados.get(contador).nome);
			System.out.println(this.empregados.get(contador).salario);
			System.out.println(this.empregados.get(contador).cpf);
			contador++;
		}
	}		
	public static void main(String []args){
			Funcionario empregado = new Funcionario();
			empregado.nome = "Marlon";
			empregado.salario = 2400;
			empregado.cpf = "000.000.000-00";
			
			Empresa empresa = new Empresa();
			empresa.nome = "CTIS";
			empresa.cnpj = "000.000.000-01";
			
			empresa.adiciona(empregado);
			empresa.mostraEmpregadosEmpresa();
	}
}