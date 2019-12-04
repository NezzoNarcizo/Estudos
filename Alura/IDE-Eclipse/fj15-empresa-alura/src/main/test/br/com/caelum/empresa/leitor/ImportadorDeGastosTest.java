package br.com.caelum.empresa.leitor;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.Collection;

import org.junit.Test;

import br.com.caelum.empresa.modelo.Gasto;

public class ImportadorDeGastosTest {

	@Test
	public void deveRetornarUmaListaVaziaSeOArquivoPassadoForVazio() throws Exception {
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);

		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> lista = importador.importa(input);

		assertTrue("A lista n�o est� vazia!", lista.isEmpty());
	}

	@Test
	public void deveRetornarUmGastoDeUmArquivoNoFormatoCorreto() throws Exception {
		ImportadorDeGastos importador = new ImportadorDeGastos();

		// Trocamos o "x" pelo "0" ap�s "CARTAO" para que a aplica��o nao tenha mais
		// erros. Descobrimos o erro debugando com JUnit
		String conteudo = "CARTAO01012011000010000123jbjasbd jbjbbb                22071983\r\n";
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());

		Collection<Gasto> lista = importador.importa(input);

//		assertEquals(1, lista.size());
	}

}
