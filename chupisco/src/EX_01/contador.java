package EX_01;

public class contador {

	int contador=0;
	
	public void Zerar() {
		this.contador = 0;
		}
	
	public void Incrementar() {
//		this.contador = this.contador +1;
		this.contador++;
	}
	
	public int RetornarValorContador() {
		return this.contador;
	}
}
