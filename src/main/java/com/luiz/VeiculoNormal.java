package com.luiz;
public abstract class VeiculoNormal implements Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public VeiculoNormal(String placa, String marca, String modelo, int ano, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "VeiculoNormal\n ano=" + ano + "\n marca=" + marca + "\n modelo=" + modelo + "\n placa=" + placa + "\n preco=" + preco;
    }
    
    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
