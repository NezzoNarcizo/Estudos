package sintaxeVariaveisEFluxo.src;

public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("Testando condicionais...");

        int idade = 20;

        if (idade >= 18) { //Entre o "if" e o "(" não é obrigatório o uso de espaço, no Java o espaço, "TAB" e "ENTER" não possuem papel fundamental.
            System.out.println("Você tem mais de 18 anos.");
            System.out.println("Seja bem vindo!");
        }

        /*
         * Obs: Temos duas instruções dentro da condicional, porém, o Java é como o C, caso tivessemos apenas uma instrução não precisariamos das "{}".
         * Porém, é recomendado o uso de chaves independente do número de instruções.
         * Isto facilita enxergarmos quem faz parte do quê.
         *
         * Para fazer o teste com o else, alteraremos a idade para 16. Agora não vai ser verdadeiro para a condição if e cairá na condição else...
         */

        System.out.println("Segundo teste...");

        idade = 16;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos.");
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        /*
         * No próximo teste acrescentaremos uma outra variável chamada "quantidadePessoas", para testarmos um if dentro do else...
         */

        System.out.println("Terceiro teste...");

        int quantidadePessoas = 3;

        // Lembrando que aqui o valor da variável idade ainda é 16...

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos.");
            System.out.println("Seja bem vindo!");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você não tem 18, mas pode entrar pois está acompanhado.");
            } else {
                System.out.println("Infelizmente você não pode entrar.");
            }
        }

        /*
        * Quando o código começa a se estender demais pela tela, dificultando a visualização integral, pode-se apertar "Enter".
        * Normalmente a IDE deixa o código funcional automaticamente, mas, caso não faça isso, podemos concatenar Strings, fechando aspas
        * e com o sinal de "+" continuando a mesma na outra linha.
        */
    }
}
