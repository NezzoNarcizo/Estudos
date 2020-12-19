package sintaxeVariaveisEFluxo.src;

public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador); // Aqui imprimiremos até o 10, porém quando for 10 executará mais uma vez e quando retornar será 11 e sairá do laço
            //Poderíamos utilizar contador = contador + 1; ou contador += 1;
            contador++; // No exercício proposto que não copiei pro projeto, o instrutor colocou está mesma estrutura mas sem o incremento, então a iteração nunca parava
        }
        //Variável contador só vai terminar aqui, já que o escopo dela é a main
        System.out.println(contador); // Aqui o 11 será impresso
    }
}
