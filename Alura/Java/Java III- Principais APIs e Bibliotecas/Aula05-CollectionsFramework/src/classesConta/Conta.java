/*
 * Obs: Esta classe possuí o exercício "Gerando o método hashCode
 */

package classesConta;

public abstract class Conta implements Comparable<Object> {

	// Atributos
	protected int numero;
	private String nome;
	private double saldo;
	private String identificador;
	private int sequencial;

	// Construtor que cria automaticamente o número da conta
	public Conta(String nome, double saldo, String identificador) {
		sequencial++;
		this.numero = sequencial;
		this.nome = nome;
		this.saldo = saldo;
		this.identificador = identificador;

	}

	// Construtor para inserir manualmente o número da conta
	public Conta(int numero, String nome, double saldo, String identificador) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.identificador = identificador;
	}

	// Métodos Getter and Setters
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIdentificador() {
		return identificador;
	}

	// "compareTo() alterado para verificar e ordenar por saldo

	/*
	 * @Override public int compareTo(Object o) { Conta c = (Conta) o; if
	 * (this.saldo < c.getSaldo()) { return -1; } if (this.saldo > c.getSaldo()) {
	 * return 1; } return 0; }
	 *
	 */

	// "compareTo() alterado para verificar e ordenar por nome
	@Override
	public int compareTo(Object o) {
		Conta c = (Conta) o;
		return this.nome.compareTo(c.getNome());
	}

	/*
	 * Podemos colocar ou remover os métodos hashCode() e equals() quando quisermos
	 * verificar se o hashSet está funcionando
	 */
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	

}
