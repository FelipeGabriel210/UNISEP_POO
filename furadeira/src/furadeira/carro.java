package furadeira;

public class carro {

    // 10 atributos
    String marca;
    String modelo;
    int ano;
    String cor;
    String placa;
    double quilometragem;
    double combustivel;
    int velocidade;
    int portas;
    boolean ligado;

    // Construtor com 5 atributos obrigatórios
    public carro(String marca, String modelo, int ano, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;

        // Valores iniciais
        this.quilometragem = 0;
        this.combustivel = 100;
        this.velocidade = 0;
        this.portas = 4;
        this.ligado = false;
    }

    // Método 1
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método 2
    public void desligar() {
        if (velocidade == 0) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("Não é possível desligar o carro em movimento.");
        }
    }

    // Método 3
    public void acelerar(int valor) {
        if (ligado) {
            velocidade += valor;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    // Método 4
    public void abastecer(double litros) {
        combustivel += litros;

        if (combustivel > 100) {
            combustivel = 100;
        }

        System.out.println("Combustível atual: " + combustivel + "%");
    }

    // Método 5
    public void mostrarInformacoes() {
        System.out.println("\n----- INFORMAÇÕES DO CARRO -----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Combustível: " + combustivel + "%");
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Portas: " + portas);
        System.out.println("Ligado: " + ligado);
    }
}
