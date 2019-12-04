package banco;

public class TestaConta {
	public static void main(String[] args) {
		Conta joao = new Conta();
		
		try { //---> Podemos pegar a exceção aqui mostrando uma msg desta classe ou recebendo a msg do método deposita.
			joao.deposita(0);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		//joao.deposita(0.0); ---> Depósito incorreto será tratado e teremos uma msg enviada do metodo deposita.
		
		try {
			joao.saca(50.0);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		} catch (Exception e) {
			System.out.println("Um outro erro qualquer!");
		}
	}
}
