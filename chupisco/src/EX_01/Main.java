package EX_01;

public class Main {

	public static void main(String[] args) {
		contador objeto1 = new contador();
		
		objeto1.Incrementar();
		objeto1.Incrementar();
		objeto1.Incrementar();
		objeto1.Incrementar();

		System.out.println("VALOR DO CONTADOR: "
		+ objeto1.RetornarValorContador());

	}

}
