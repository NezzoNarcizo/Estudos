package sintaxeVariaveisEFluxo.src;

public class TestaVariaveis {
    public static void main(String[] args) {
        System.out.println("Olá novo teste!");

        /*
         - Declaração de variável
         - É necessária a delaração de variáveis já que o java é fortemente tipado
         - Caso não declare a variável, a seguinte mensagem será exibida (no caso de 'idade') - "idade cannot be resolved to a variable"
         - int - Tipo número que armazena valores "Inteiros", ou seja, sem decimais ou pontos flutuantes
        */

        int idade = 37;

        // Imprimindo a variável idade - Impressão de variável sem as "", já que quero o valor da variável e não a String idade
        System.out.println(idade);

        // Testando operadores
        idade = 30 + 10;

        System.out.println(idade);

        idade = 7 * 5 + 2;

        System.out.println(idade);

        //Os números sendo convertidos em letras e tudo sendo concatenado
        System.out.println("A idade é " + idade + "!");

        // Utilizando o "print" ao invés de "println"
        System.out.print("A idade é ");
        System.out.println(idade + "!");
    }
}
