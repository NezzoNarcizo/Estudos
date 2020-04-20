package sintaxeVariaveisEFluxo.src;

public class TestaPontoFlutuante {
    public static void main(String[] args) {

        double salario = 1250.70;
        System.out.println("Meu salário é: " + salario);

        /*
            É compativel colocar um número inteiro em um ponto flutante, o contrário não.
            O erro que ocorre é o seguinte: "Type mismatch: cannot convert from double to int"
        */
        double idade = 37;
        System.out.println("A idade é: " + idade);

        // No java utilizamos ponto e não vírgula em números decimais.
        double divisao = 3.14 / 2;
        System.out.println("Resultado da divisão: " + divisao);

        // O Java tem uma regra que é, quando ele pega um inteiro e faz conta com outro inteiro, ele força o resultado para inteiro, ignorando as dizimas periódicas
        int outraDivisao = 5 / 2;
        System.out.println("Divisão ignorando a dízima periódica: " + outraDivisao);

        double novaTentativa = 5 / 2; //Temos um warning aqui, é normal, estamos tentando dividir dois inteiro e colocar em um ponto flutuante.
        System.out.println("Divisão de números inteiros armazenando num ponto flutuante: " + novaTentativa);
        /*
            O Java realiza a operação da direita para a esquerda depois ele verifica se pode armazenar o valor na várival da operação.
            Ou seja, por mais que o tipo "double" aceita valores com dízimas, a operação foi feita com valores inteiros sem sugerir a possibilidade de dízimas.
            Na prática, da a impressão que o Java já está se preparando para uma variável int após ver operação com apenas números inteiros.
            Sendo assim, ele, assim como o int, irá ignorar o que vem depois da virgula.

            Obs: Mesmo valores como "3.0" não serão aceitos como "int"

            Exemplo:
         */
        double outraTentativa = 5.0 / 2;
        System.out.println("Divisão com resultado com dízimas: " + outraTentativa);
    }
}
