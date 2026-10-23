package teste;

public class aluno {

	//Atributos
	String nome;
	String ra;
	float valor_mensalidade;
	
	//construtores
	public aluno() {
		this.nome = "NOME NAO PREENCHIDO";
		this.ra = "RA NAO PREENCHIDO";
		this.valor_mensalidade = 0;
	}
	
	public aluno(String nome, String ra, float valor_mensalidade) {
		this.nome = nome;
		this.ra = ra;
		this.valor_mensalidade = valor_mensalidade;
	}
	//metodos
	public void imprimir_aluno() {
	    System.out.println("Nome do Aluno: " + this.nome);
	    System.out.println("RA do Aluno: " + this.ra);
	    System.out.println("Valor da Mensalidade: " + this.valor_mensalidade);
	 }
	
}
