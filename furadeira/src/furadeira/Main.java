package furadeira;

public class Main {

    public static void main(String[] args) {

        // Criação do objeto
        carro meuCarro = new carro(
            "Chevrolet",
            "Vectra",
            1998,
            "Prata",
            "ABC-1234"
        );

        // Exibindo informações
        meuCarro.mostrarInformacoes();

        // Utilizando os métodos
        meuCarro.ligar();

        meuCarro.acelerar(40);

        meuCarro.abastecer(20);

        // Para conseguir desligar, primeiro reduzimos a velocidade
        meuCarro.velocidade = 0;

        meuCarro.desligar();

        meuCarro.mostrarInformacoes();
    }
}
