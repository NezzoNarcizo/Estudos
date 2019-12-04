/*
 * Obs: Aqui nesta Classe temos os exercícios:
 * 		* Criando a Classe Banco
 * 		* Alterando a Classe Banco
 * 		
 */

package classesConta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	// Criando uma lista de contas genéricas dentro de "Banco"
	private List<Conta> contas = new ArrayList<>();

	// Utilizando Map para testar alguns métodos
	Map<String, Conta> mapaDeContas = new HashMap<>();

	// Criando um método sem retorno apenas para adicionar as contas
	public void adicionaConta(Conta conta) {
		contas.add(conta);
		mapaDeContas.put(conta.getNome(), conta);
	}

	// Método que retorna uma conta de uma posição específica
	public Conta buscaConta(int posicao) {
		return contas.get(posicao);
	}

	// Método que retorna a quantidade de contas existentes no Banco
	public int quantidadeDeContas() {
		return contas.size();
	}

	// Método que busca conta por nome
	public Conta buscaPorNome(String nome) {
		return mapaDeContas.get(nome);
	}

}
