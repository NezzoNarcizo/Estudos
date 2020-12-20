package sintaxeVariaveisEFluxo.src;

public class DesafioFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }

    /*
        O fatorial é sempre o produto de números consecutivos inteiros de 1 até o próprio número. Ex: Fatorial de 4 = 4 x 3 x 2 x 1 = 24 ou
        fatorial de 4 = 4 x 3! = 24. Com essa última lógica é que essa questão é feita. Pegando sempre o número que a gente quer e multiplicando
        pelo fatorial do número anterior.

     */
}
