package contador;

public class Contador {

    private int valor;

    // Zerar o contador
    public void zerar() {
        valor = 0;
    }

    // Incrementar o contador
    public void incrementar() {
        valor++;
    }

    // Retornar o valor
    public int getValor() {
        return valor;
    }
}