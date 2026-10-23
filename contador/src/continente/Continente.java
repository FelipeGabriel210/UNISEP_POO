package continente;

import java.util.ArrayList;

public class Continente {

    private String nome;
    private ArrayList<Pais> paises;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Adicionar país
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    // Dimensão total
    public double getDimensaoTotal() {
        double total = 0;

        for (Pais pais : paises) {
            total += pais.getDimensao();
        }

        return total;
    }

    // População total
    public long getPopulacaoTotal() {
        long total = 0;

        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }

        return total;
    }

    // Densidade populacional
    public double getDensidadePopulacional() {
        return getPopulacaoTotal() / getDimensaoTotal();
    }

    // País com maior população
    public Pais getPaisMaiorPopulacao() {
        Pais maior = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() > maior.getPopulacao()) {
                maior = pais;
            }
        }

        return maior;
    }

    // País com menor população
    public Pais getPaisMenorPopulacao() {
        Pais menor = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() < menor.getPopulacao()) {
                menor = pais;
            }
        }

        return menor;
    }

    // País com maior dimensão territorial
    public Pais getPaisMaiorDimensao() {
        Pais maior = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensao() > maior.getDimensao()) {
                maior = pais;
            }
        }

        return maior;
    }

    // País com menor dimensão territorial
    public Pais getPaisMenorDimensao() {
        Pais menor = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensao() < menor.getDimensao()) {
                menor = pais;
            }
        }

        return menor;
    }

    // Razão territorial do maior país em relação ao menor
    public double getRazaoTerritorial() {
        return getPaisMaiorDimensao().getDimensao()
                / getPaisMenorDimensao().getDimensao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}