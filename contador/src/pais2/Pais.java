package pais2;

import java.util.ArrayList;

public class Pais {

    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private ArrayList<Pais> fronteiras;

    // Construtor
    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    // Getters e Setters

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Pais> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(ArrayList<Pais> fronteiras) {
        this.fronteiras = fronteiras;
    }
}