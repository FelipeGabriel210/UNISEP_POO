package calculadora;


public class Main {
    public static void main(String[] args) {

        soma soma = new soma(10, 5);
        subtracao subtracao = new subtracao(10, 5);
        multiplicacao multiplicacao = new multiplicacao(10, 5);
        divisao divisao = new divisao(10, 5);

        System.out.println("Soma: " + soma.calcular());
        System.out.println("Subtração: " + subtracao.calcular());
        System.out.println("Multiplicação: " + multiplicacao.calcular());
        System.out.println("Divisão: " + divisao.calcular());
    }
}
