package br.com.caelum.empresa;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class FiltradorDeGastosEspeciaisTest {

	@Test
    public void soDevolveGastosComValorMaiorQueOLimite() throws Exception {
        Funcionario funcionario = new Funcionario("Felipe", 123, new GregorianCalendar(1989, 3, 17));
        Calendar hoje = Calendar.getInstance();

        Gasto g1 = new Gasto(25.0, "almoco", funcionario, hoje);
        Gasto g2 = new Gasto(150.0, "jantar", funcionario, hoje);
        Gasto g3 = new Gasto(22.0, "extras", funcionario, hoje);
        List<Gasto> lista = Arrays.asList(g1, g2, g3);

        FiltradorDeGastosEspeciais filtrador = new FiltradorDeGastosEspeciais(25.0);
        List<Gasto> gastosGrandes = filtrador.filtraGastosGrandes(lista);

        //assertEquals(1, gastosGrandes.size()); -> Este assertEquals garante que a lista chegue com apenas 1 objeto
        //assertEquals(150.0, gastosGrandes.get(0).getValor(), 0.00001); Este assertEqual garante que o valor seja 150.0 ou 149.99999
        assertEquals(2, gastosGrandes.size());
        assertEquals(25.0, gastosGrandes.get(0).getValor(), 0.00001);
        assertEquals(150.0, gastosGrandes.get(1).getValor(), 0.00001);
        
        /*
         * Setinhas: navegação nos testes;
		   Show failures only: só mostra relatório dos testes que não passaram;
		   Scroll lock: não é exatamente útil;
		   Rerun tests: roda novamente a mesma bateria de testes pedidos na última vez;
		   Rerun tests - failure first: roda os testes da mesma bateria, mas começa a execução pelos que quebraram da última vez.
         */
        
        //For apenas para visualizar o resultado
        for (int i = 0; i < gastosGrandes.size(); i++) {
			System.out.println(gastosGrandes.get(i));
		}
        /*
         * O propósito do parâmetro delta desse método (Terceiro parâmetro) é determinar o valor máximo da 
         * diferença entre os números "expected" e "actual" (Primeiro e Segundo Parâmetro respectivamente) 
         *  para que eles sejam considerados o mesmo valor.
         */

    }
}
