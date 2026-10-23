package peido;

public class Pais {
	
	//Atributos
	String codigo;
	String  nome;
	int populacao;
	double dimensao;
	
	//Construtores
	Pais(String codigo,
		String nome,
		double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	//Metodos
	static void listarPais(){
		System.out.println("Código: "
				+ this.codigo);
		
		System.out.println("Nome: "
				+ this.nome);
	}

}
