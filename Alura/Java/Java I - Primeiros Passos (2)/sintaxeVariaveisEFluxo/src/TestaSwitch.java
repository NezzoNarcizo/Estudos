package sintaxeVariaveisEFluxo.src;

public class TestaSwitch {
    public static void main(String[] args) {
        /*
         * Vimos como fazer testes com if's, mas e se precisarmos fazer vários testes?
         * Veremos a seguir se o caso de termos um menu com meses do ano
         */

        /*
         * Faremos um algoritmo com switch para imprimir o nome do mês de acordo com o número que fornecermos
         */

        int mes = 4;

        switch (mes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }

        /*
         * Nessa aula, aprendemos:
         *
         * como usar o if
         * como usar as operações lógicas AND (&&) e OR (||)
         * trabalhar com o escopo de variáveis
         * Também já vimos alguns atalhos no Eclipse:
         *
         * main ctrl + espaço
         * para gerar o método main
         * ctrl + shift + f
         * para formatar o código fonte
         * sysout + ctrl + espaço
         * para gerar a instrução System.out.println()
         */
    }
}
