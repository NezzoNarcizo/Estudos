package br.com.caelum.empresa.dao;


import com.sun.istack.internal.logging.Logger;

import br.com.caelum.empresa.modelo.Funcionario;

public class FuncionarioDAO extends DAO<Funcionario> {
	/**
	 * Logger para auditoria da classe FuncionarioDAO
	 * @author nesso
	 * 
	 * Aqui também utilizamos um template para tornar a codificação um pouco mais ágil
	 * 
	 * Java -> Editor -> Template
	 *  No caso criamos uma variável logger que ja importa a classe e cria uma instancia do tipo da classe na qual é chamado.
	 * private static final ${type:newType(com.sun.istack.internal.logging.Logger)} logger = Logger.getLogger(${enclosing_type}.class);
	 */
	private static final Logger logger = Logger.getLogger(FuncionarioDAO.class);	
	
	public FuncionarioDAO() {
		super(Funcionario.class);
		// TODO Auto-generated constructor stub
	}
	
}
