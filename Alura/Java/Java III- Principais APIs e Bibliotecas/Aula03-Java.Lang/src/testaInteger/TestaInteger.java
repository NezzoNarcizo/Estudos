package testaInteger;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);
	    
	    //Aqui estamos comparando os objetos integer
	    if (x1 == x2) {
	        System.out.println("Igual");
	    } else {
	        System.out.println("Diferente");
	    }
	    
	    //Aqui estamos comparando os conteúdos dos objetos
	    if(x1.equals(x2)) {
	    	System.out.println("Igual");
	    } else {
	    	System.out.println("Diferente");
	    }
	}
}