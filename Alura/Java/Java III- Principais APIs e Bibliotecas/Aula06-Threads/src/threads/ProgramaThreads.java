package threads;

public class ProgramaThreads {
	public static void main(String[] args) {

		GeraPdf pdf = new GeraPdf();
		Thread threadPdf = new Thread(pdf);
		threadPdf.start();

		/*
		 * Se quisermos pausar uma Thread fazemos Thread.sleep(), entre parenteses
		 * definimos o tempo e lançamos a InterruptedException
		 */

		/*
		 * Como a classe Thread pertence ao pacote java.lang mesmo, não precisamos fazer
		 * nenhum import java.lang é o único pacote do java que é importado
		 * automaticamente (String e System pertencem a ele também)
		 */

		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadBarraDeProgresso = new Thread(barraDeProgresso);
		threadBarraDeProgresso.start();

	}
}
