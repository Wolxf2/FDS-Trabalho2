package com.luiz;
public class VeiculoUtilitario extends VeiculoNormal{

    private double capCargaKG;
    private int nroEixos;

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double preco, double capCargaKG,
            int nroEixos) {
        super(placa, marca, modelo, ano, preco);
        this.capCargaKG = capCargaKG;
        this.nroEixos = nroEixos;
    }

    public double getCapCargaKG() {
        return capCargaKG;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    @Override
    public String toString() {
        return "capCargaKG= " + capCargaKG + "\n nroEixos= " + nroEixos;
    }
}