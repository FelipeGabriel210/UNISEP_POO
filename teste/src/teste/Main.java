package teste;

public class Main {

	public static void main(String[] args) {
		aluno objeto1 = new aluno("Guilherme", "123456", 800);
		
//		objeto1.nome = "Guilherme";
//		objeto1.ra = "123456";
//		objeto1.valor_mensalidade = 800;
		
		objeto1.imprimir_aluno();
		
		aluno objeto2 = new aluno("Felipe", "654321", 550);
		
//		objeto2.nome = "Felipe";
//		objeto2.ra = "654321";
//		objeto2.valor_mensalidade = 550;
		
		objeto2.imprimir_aluno();
		
		aluno objeto3 = new aluno("Maria", "78905", 600);
		
		objeto3.imprimir_aluno();
		
		aluno objeto4 = new aluno("Jose", "24680", 300);
		
		objeto4.imprimir_aluno();
		
		
	}

}
