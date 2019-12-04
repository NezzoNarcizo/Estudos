package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class Principal {
//    public static final LeitorCSV LEITOR_CSV = new LeitorCSV(); "Criado a partir do CTRL + ALT + C em cima da instancia de new LeitorCSV()."

//    static final Logger logger = Logger.getLogger(Principal.class);

    static final Logger logger = Logger.getLogger(Principal.class);

    public static void main(String[] args) throws IOException {
//        new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);

//        LEITOR_CSV; "Criado a partir do CTRL + ALT + C em cima da instancia de new LeitorCSV()."


        for (Pagamento pagamento : pagamentos) {

            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorComAcrescimo = valorBruto * 1.1;

                pagamento.setValor(valorComAcrescimo);
            }
            System.out.println(pagamentos);
        }

        if (true /*Pipe vem pra cá após adicionar o template*/) {
            System.out.println("Teste com if pronto"); /*Variável nativa do IntelliJ que representa o local onde a seleção
                        vai ficar após adicionar o template.*/
        }
    }

}

