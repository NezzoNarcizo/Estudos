package interfaces;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel r = new Retangulo(3,2);
		AreaCalculavel q = new Quadrado(2);
		AreaCalculavel c = new Circulo(10);
		System.out.println(r.calculaArea());
		System.out.println(q.calculaArea());
		System.out.println(c.calculaArea());
	}
}
