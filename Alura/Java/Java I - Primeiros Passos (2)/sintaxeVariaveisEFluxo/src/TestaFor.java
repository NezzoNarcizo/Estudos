package sintaxeVariaveisEFluxo.src;

public class TestaFor {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }
        //System.out.println(contador); Exemplo de sintaxe que geraria um erro pois a variável contador só existe dentro do escopo do for
    }

    /*
        Dessa vez, Clarice resolveu desafiar Fernando a transformar o código a seguir que utiliza um laço while em um código que utilize o for.
        Você consegue ajudar Fernando a chegar a resposta do desafio? Compare a sua resposta com a do instrutor e verifique se acertou!

        package projeto;

        public class Programa {
            public static void main(String[] args) {
                int contador = 0;
                while(contador <= 10) {
                    System.out.println(contador);
                    contador++;
                }
            }
        }

        -------|||||||-------

        package projeto;

        public class Programa{
            public static void main (String[] args){
                for(int contador = 0; contador <= 10; contador++){
                    System.out.println(contador);
                }
            }
        }

     */
}
