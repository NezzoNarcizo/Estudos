package banco;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		
		//Gerenciador foi criado para somar todos os tributaveis e deduzir no imposto de renda
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		//Criamos um objeto de seguro de vida para poder buscar seu valor
		SeguroDeVida sv =  new SeguroDeVida();
		
		//Adicionamos o valor dos tributaveis do Gerenciador de Imposto de Renda
		gerenciador.adiciona(sv);
		
		//Criamos uma conta corrente para depositar um valor e calcular seu tributo
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		
		//Agora o objeto do Gerenciador inclui o objeto conta corrente para somar seus tributos
		gerenciador.adiciona(cc);
		
		//Aqui imprimimos o total de tributos somados
		System.out.println(gerenciador.getTotal());
		
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		cp.atualiza(0.01);
		
		System.out.println("O saldo é: "+ cp.getSaldo());
		System.out.printf("O saldo é: %.2f\n", cp.getSaldo());
	}
}
