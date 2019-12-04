package banco;

public class ValorInvalidoException extends RuntimeException {

	private final double valor;

	public ValorInvalidoException(double valor) {
		super("Valor não está correto: " + valor);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
