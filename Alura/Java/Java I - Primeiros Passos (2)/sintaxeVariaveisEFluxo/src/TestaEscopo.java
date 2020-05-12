package sintaxeVariaveisEFluxo.src;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais...");

        int idade = 16;
        int quantidadePessoas = 3;
        boolean acompanhado;

        /* System.out.println(acompanhado);
         * Não conseguiremos compilar o código, pois acima estamos tentando imprimir o valor de uma variável que ainda
         * não existe, não fizemos sua inicialização.
         *
         * No "if/else" abaixo poderíamos declarar boolean acompanhado = true ou boolean acompanhado = false
         * Não estaríamos declarando duas vezes a mesma variável, pois ela existe apenas no escopo em que foi criada.
         * em outras palavras, só existe dentro do bloco de chaves que foi criada.
         */

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

        // A pessoa não tinha mais de 18 anos, porém, estava acompanhada...
    }
}
