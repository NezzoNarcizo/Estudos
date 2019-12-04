package br.com.caelum.empresa.dao;

import java.util.List;

import com.sun.istack.internal.logging.Logger;

import br.com.caelum.empresa.modelo.Gasto;

public class GastoDAO {	
	private DAO<Gasto> dao = new DAO<Gasto>(Gasto.class);
	
	private static final Logger logger = Logger.getLogger(GastoDAO.class);
	
	/*
	 * 
	Para utilizarmos o construtor abaixo devemos adicionar o extends da classe DAO e o tipo da classe
	a qual este DAO pertence, no caso Gasto.
	
	Porém devemos evitar o uso desnecessário de herança e utilizar composição em seu lugar.
	
	Nao precisamos herdar de DAR para utilizarmos seus métodos e reutilizar seu código.
	
	Podemos criar um atributo do tipo DAO e delegar a ele todas as chamadas de método que precisamos
	
	public GastoDAO() {
		super(Gasto.class);
		// TODO Auto-generated constructor stub
	}
	*/
	

	public void adiciona(Gasto entity) {
		dao.adiciona(entity);
	}

	public void remove(Gasto entity) {
		dao.remove(entity);
	}

	public Gasto buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Gasto> buscaTodos() {
		return dao.buscaTodos();
	}	
	
}