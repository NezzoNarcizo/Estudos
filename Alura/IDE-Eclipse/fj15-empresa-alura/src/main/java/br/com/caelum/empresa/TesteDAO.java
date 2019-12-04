package br.com.caelum.empresa;

import java.util.List;

import br.com.caelum.empresa.dao.GastoDAO;
import br.com.caelum.empresa.modelo.Gasto;

public class TesteDAO {
	
	/*
	 * 	Templates são pequenas estruturas de código configuráveis que 
	 * 	podemos usar para criar trechos pré-definidos de código. 
	 * 	Para acessá-los é só digitar o nome do template e pressionar ctrl+espaço. 
	 * 	O Eclipse já vem com vários desses templates configurados
	 */
	
	public static void main(String[] args) {
		GastoDAO dao = new GastoDAO();
		List<Gasto> todos = dao.buscaTodos();
		
		/*
		for (Gasto gasto : todos) {
			System.out.println(gasto);
		}
		*/
		
		
		/* Temos a seguir um template baseado no foreach para impressão dos gastos
		 * 
		 * Foreach para impressão de uma lista do tipo ${enclosing_type}
		 * @author ${user}
		 * 
		 * for (${iterable_type} ${iterable_element} : ${iterable}) {
				System.out.println(${iterable_element});
			} 

		*/
		
		
		/**
		 * Foreach para impressão de uma lista do tipo TesteDAO
		 * @author nesso
		 */
		for (Gasto gasto : todos) {
			System.out.println(gasto);
		}
	}
}
