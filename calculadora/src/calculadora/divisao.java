package calculadora;


public class divisao extends calculadora {

    public divisao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    public double calcular() {
        if (valor2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return valor1 / valor2;
    }
}
