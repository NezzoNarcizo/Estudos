package sintaxeVariaveisEFluxo.src;

public class TestaCondicional2 {

    // Assim é o código da classe "TestaCondicional" de forma enxuta...

    public static void main(String[] args) {
        System.out.println("Testando condicionais...");
        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos.");
            System.out.println("Seja bem vindo!");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você não tem mais de 18 anos, mas pode entrar pois está acompanhado.");
            } else {
                System.out.println("Infelizmente você não pode entrar.");
            }
        }

        /*
         * Agora vamos ver outros detalhes importantes...
         *
         * Não é muito legal ter muitos if's e else's encadeados, algo academicamente denominado complexidade ciclomática
         * ou complexidade condicional.
         *
         * Poderíamos juntar os casos em que a pessoa tem mais de 18 anos ou está acompanhada na mesma condicional
         *
         * Para isso, como a própria lógica da proposta sugere, podemos utilizar o operador "ou" (||)
         * No Java não existe or ou and.
         */

        System.out.println("Testando o 'ou' (||)...");

        // Obs: Cuidado para não tentar declarar novamente a variável que estamos reatribuindo valores, isto da erro...

        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        /*
         * Obs: Para este operador (||) basta que uma das expressões buleanas seja "true" ou "false"
         * No caso usamos o operador "e" (&&) quando precisamos que mais de uma expressão seja "true" ou "false"
         *
         * O tipo "boolean" só aceita dois valores, true ou false, e fazem parte das palavras reservadas do Java.
         *
         * Abaixo um exemplo de como seria o resultado caso utilizassemos o "e" (&&)
         */

        System.out.println("Testando a variável booleana 'acompanhado'...");

        boolean acompanhado = true;

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        /*
         * No Java "=" atribui enquanto "==" compara.
         * Como estamos trabalhando com booleanos, e "acompanhado" já é um booleano, fazer "acompanhado == true" é desnecessário
         *
         * Temos o valor "true" dentro da variável "acompanhado", mas também poderíamos ter uma expressão booleana que
         * dentro da condicional nos retornará true ou false. Exemplo...
         */

        System.out.println("Testando uma expressão booleana dentro da variável booleana...");

        idade = 20;
        quantidadePessoas = 3;
        acompanhado = quantidadePessoas >= 2;

        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}
