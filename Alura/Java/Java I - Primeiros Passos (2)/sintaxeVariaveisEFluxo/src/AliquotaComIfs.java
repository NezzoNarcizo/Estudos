package sintaxeVariaveisEFluxo.src;

public class AliquotaComIfs {
    public static void main(String[] args) {
        double salario = 3751.02;

        if (salario < 1900.0) {
            System.out.println("Isento");
        } else if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7,5%");
            System.out.println("Você pode deduzir até R$ 142");
            double aliquota;
            double ir;
            aliquota = salario * 0.075;
            ir = aliquota - 142.0;
            System.out.println("Salario: "+(salario -= ir));
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
            double aliquota;
            double ir;
            aliquota = salario * 0.15;
            ir = aliquota - 350.0;
            System.out.println("Salario: "+(salario -= ir));
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");
            double aliquota;
            double ir;
            aliquota = salario * 0.225;
            ir = aliquota - 636.0;
            System.out.println("Salario: "+(salario -= ir));
        } else {
            System.out.println("Salário alto hein bicho...");
        }

        /*
         * Obs: Os valores de alíquota exatos foram simplificados. Os valores exatos se encontram neste link.
         * http://receita.economia.gov.br/acesso-rapido/tributos/irpf-imposto-de-renda-pessoa-fisica
         */
    }
}
