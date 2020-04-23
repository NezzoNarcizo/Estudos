package sintaxeVariaveisEFluxo.src;

public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;

        System.out.println(segundo);
        /*
         * Aqui veremos que a saída é 7
         * E se acrescentarmos um detalhe simples no fluxo
         * Vamos testar...
         */

        primeiro = 5;
        segundo = 7;
        segundo = primeiro;

        System.out.println(segundo);

        /*
        * Obs: Detalhe importante que não sei se foi anotado antes. Podemos reparar que na segunda atribuição de valor
        * não temos o indicador do tipo a frente, ou seja, no java, declaramos apenas uma vez a variável.
        *
        * Qual será a nossa saída acima? 5! Pois atribuímos à variável "segundo" o valor da "primeiro"
        *
        * Agora um ultimo teste...
        */

        primeiro = 5;
        segundo = 7;
        segundo = primeiro;
        primeiro = 10;

        // Quanto vale agora a variável "segundo"?

        System.out.println(segundo);

        /*
        *  As linguagens de programação trabalham de forma diferente dependendo do uso de um símbolo específico, ou da
        *  existência de alguma referência, e por aí vai. Estas variáveis são trabalhadas com o valor do conteúdo,
        *  portanto, mudar o valor da variável "primeiro" não significa nada. Uma não está referenciando a outra.
        *
        *  Atribuição no Java, significa que estamos copiando e colando valores e não que agora um variável está
        *  apontando para outra. Por isso a saída acima continua sendo 5.
        */

        /*
        * Este capítulo apresentou:
        *
        *   O conceito e como declarar char e String
        *   Como concatenar Strings
        *   Atalho para criação da main
        *   Variáveis guardam valores e não referências.
        */


    }
}
