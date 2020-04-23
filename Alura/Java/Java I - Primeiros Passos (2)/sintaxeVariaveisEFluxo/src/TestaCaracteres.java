package sintaxeVariaveisEFluxo.src;

public class TestaCaracteres {
    public static void main(String[] args) {
        /*
         * Existe uma variável primitiva básica do Java que trabalha com chars, isto é, caracteres, cuja peculiaridade é
         * guardar um único caractere de 16bits
         */
        char letra = 'a'; //Devemos nos atentar que este único caracter deve estar com aspas simples

        System.out.println(letra);

        //Obs: Se tentarmos colocar 'ab' não compilará, mesmo que troquemos aspas simples por duplas, ele não é String

        /*
        * O char guarda em si um único código, um número da tabela de Unicode, como a ASCII, porém muito maior e sem
        * limite definido...
        *
        * Letra, portanto é um número e, se observarmos bem, o char guarda em seu valor um número, mas é uma variável
        * do tipo numérico equivalente áquele short, mas ele contém apenas valores positivos, possuindo mais detalhes.
        *
        * Resumidamente, ele é um número que é convertido em algum caracter da tabela ASCII
        *
        * Usaremos um exemplo a seguir...
        */
        char valor = 66;
        System.out.println(valor);
        //Veremos que a saída no console é 'B', pois na tabela ASCII/Unicode o 66 é o indice da letra B maiúscula

        /* Vamos realizar outro teste...
         * valor = valor + 1; Desta forma nosso código não irá compilar, por causa da regra do Java quando se trabalha
         * com dois tipos distintos em uma mesma operação, o resultado não "caber" no tipo. Neste caso, o valor é do
         * tipo char, e 1 é int, int é maior que char. Já o char cabe em um int.
         *
         * Para tornar isto válido, vamos fazer o casting para que o resultado/saída seja do tipo que queremos...
         */
        valor = (char) (valor + 1);
        System.out.println(valor);
        /*
         * Veremos que a saída é 'C', pois o valor anterior (66) mais 1 é 67, e 67 é o índice do caractere C na tabela
         * Obs: O char é muito interessante, porém não é tão utilizado quanto a classe String no dia a dia
         *
         * String não é palavra chave do Java, não guarda valor, é um tipo referência.
         *
         * String exige aspas duplas, e não simples...Podem inclusive estar vazias. Já no char utilizamos apenas aspas
         * simples e não é permitido que estejam vazias, podemos até colocar um espaço entre elas que será aceito, mas
         * jamais vazias.
         *
         * Abaixo um exemplo de String...
         */

        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);

        // Podemos utilizar o operador + para concatenar Strings, criando uma nova...Veremos o exemplo abaixo...

        palavra = palavra + 2020;
        System.out.println(palavra);

        /*
         * A saída será: Alura cursos online de tecnologia2020
         * A String não se comporta como int nem como char, mas aparecerá recorrentemente
         */
    }
}
