package calculadora;


public class multiplicacao extends calculadora {

    public multiplicacao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    public double calcular() {
        return valor1 * valor2;
    }
}
