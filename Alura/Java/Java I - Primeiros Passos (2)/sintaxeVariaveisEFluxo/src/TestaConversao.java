package sintaxeVariaveisEFluxo.src;

public class TestaConversao {
    public static void main(String[] args) {

        double salario = 1270.5;

        // Casting de double para int
        int valor = (int) salario;
        System.out.println(valor);

        // Só é exibida a parte inteira do valor
        // Casting só é utilizado quando a conversão não é feita de forma automática

        /*
            No tipo int numérico cabem 32 bits, sinais positivos e negativos, pode guardar até mais ou menos 2000000 (dois bilhões).
            Caso precisemos de algo que armazene um número maior, utilizaremos o long onde cabe 64 bits que pode guardar algo muito além de 2 bilhões.

            Já o short é a metade do int (32 bits) e o byte é menor ainda.

            Caso tente guardar um valor maior que o tipo de variável aguenta ocorrerá um overflow.
        */

        // Exemplos de declarações de outros tipos
        long numeroGrande = 32432423523L;

        // Obs: o "L" (letra L em maiusculo) ou "l" (Letra L em minusculo) ao final do long, é necessário para indicar que estouramos os dois bilhões.
        // L indica literal.

        short valorPequeno = 2131;
        byte muitoPequeno = 127;
        System.out.println(numeroGrande + " " + valorPequeno + " " + muitoPequeno);


        // "Mistério"
        double valor1 = 0.1;
        double valor2 = 0.2;
        double resultado = valor1 + valor2;
        System.out.println(resultado);

        /*
            Porque o resultado é 0.30000000000000004 e não 0.3?

            Não é à toa - como uma representação de decimal do inteiro é utilizada para se obter um ponto flutuante,
            fica complicado fazer uma operação aritmética deste tipo e guardar o resultado internamente.
            Por isto, o Java, como muitas outras linguagens, segue a especificação IEEE 754, de leitura complexa, que remete à Engenharia.
            De qualquer forma, é normal que este resultado apareça quando utilizamos o double.

            Por este motivo double não é o melhor tipo para armazenarmos valores financeiros
            No Java existem outros tipos que servem melhor para esta finalidade
         */

        float outroPontoFlutuante = (float) 3.14;
        System.out.println("Casting de ponto flutuante de 64 bits para 32: " + outroPontoFlutuante);

        float pontoFlutuanteIndicadoComoFloat = 3.14f;
        System.out.println("Indicação de que é um float: " + pontoFlutuanteIndicadoComoFloat);

        /*
           Apesar de float ser ponto flutuante assim como o double, ele não aceita o valor 3.14 por ser valor double 64 bits enquanto ele tem capacidade para 32
            Por isso temos que fazer o casting. Caso tentássemos inserir o valor na variável float sem o casting o erro que apareceria seria o seguinte:
             "java: incompatible types: possible lossy conversion from double to float"
        */

        // Acima de 64 bits utilizaremos objetos
    }
}
