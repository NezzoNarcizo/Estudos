package sintaxeVariaveisEFluxo.src;

public class TestaLacos2 {
    public static void main(String[] args) {
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna <= 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
        Obs: Quando temos apenas uma instrução "statement" dentro do if, for ou while não necessitamos das chaves ({})...
        Porém por boas práticas, legibilidade e convenção, é ideal que sempre coloquemos.
     */

    /*
        Nosso programa acima sem o break imprimiria:

        ***********
        ***********
        ***********
        ***********
        ***********
        ***********
        ***********
        ***********
        ***********
        ***********

        Com o break:

        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********
        **********

     */

    /*
        Obs2: Não precisavamos utilizar o break também, bastava deixar o for assim:

         for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
         }


     */
}
