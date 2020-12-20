package sintaxeVariaveisEFluxo.src;

public class TestaSomatoria {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        while (contador <= 10) { //Queremos ver uma soma de números progressiva...Ex ((((((((((0 + 1) + 2) + 3) + 4) + 5) + 6) + 7) + 8) + 9) + 10)
            total += contador;

            contador++;
            System.out.println(total); // Aqui estamos imprimindo o resultado parcial a cada iteração do laço
            //0 - 1 - 3 - 6 - 10 - 15 - 21 - 28 - 36 - 45 - 55
        }
        System.out.println(total); // Aqui vai imprimir mais uma vez o número 55

        /*
            Teste: Um erro de compilação...

            Clarice, amiga de Fernando, percebeu que ele está com dificuldade na implementação de um loop feito com while. Seu objetivo é imprimir
            no console os números de 1 a 10. No entanto, o código não compilava. Vejamos seu código:

            Se você estivesse com Clarice agora, como explicaria o problema do código para ele? Depois de pensar em uma explicação,
            compare-a com a do instrutor a seguir.
         */

        //Código:

        /*while(contador <= 10){
            int contador = 1;
            System.out.println(contador);
            contador++;
        }*/

        //R: O while já está utilizando o contador, porém esta variável só é inicializada dentro do escopo deste próprio while
    }
}

