package peido;

public class Main {
	
	public static void main(String[] args) {
		
		Pais brasil = new Pais("BRA",
			 "Brasil",
		       8515767.049);
		
		Pais mexico = new Pais("MEX",
				"Mexico",
				8515767.049);
		
		Pais paraguai = new Pais("PY",
				"Paraguai",
				8515767.049);
		
		brasil.listarPais();
		mexico.listarPais();
		paraguai.listarPais();
		
		
	}

}
