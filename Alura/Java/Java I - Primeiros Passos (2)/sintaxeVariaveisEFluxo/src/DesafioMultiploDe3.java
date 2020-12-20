package sintaxeVariaveisEFluxo.src;

public class DesafioMultiploDe3 {
    public static void main(String[] args) {
        /*
            Segue mais um exercício para praticar o laço for!

            Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.

            Dica: Existem duas maneiras tradicionais de resolver este problema. Uma delas consiste em fazer o for, e utilizar numero % 3 para descobrir o
            resto da divisão de um número por 3 (o operador % se chama de módulo). Se o resto for zero, ele é divisível por 3. Como em:

            if(numero % 3 == 0) {
              // faça algo
            }

            Outra abordagem é fazer um laço um pouco diferente, que pula já direto pelos múltiplos de três. Existem outras abordagens, escolha a sua e faça a
            implementação em uma nova classe!
         */

        //Primeira abordagem
        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.print(numero);
                System.out.print(" ");
            }
        }

        System.out.println("");

        //Segunda abordagem
        for (int numero = 0; numero <= 100; numero += 3) {
            System.out.print(numero);
            System.out.print(" ");
        }

        System.out.println("");

        //Terceira abordagem
        for (int numero = 0; numero <= 100; numero++) {
            int total = numero * 3;
            if (total >= 100) {
                break;
            }
            System.out.print(total);
            System.out.print(" ");
        }

    }
}
