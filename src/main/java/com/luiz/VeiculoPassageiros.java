package com.luiz;
public class VeiculoPassageiros extends VeiculoNormal{
    
    public int nroPass;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double preco, int nroPass) {
        super(placa, marca, modelo, ano, preco);
        this.nroPass = nroPass;
    }

    public int getNroPass() {
        return nroPass;
    }

    public void setNroPass(int nroPass) {
        this.nroPass = nroPass;
    }

    @Override
    public String toString() {
        return "Numero de Passageiros= " + nroPass;
    }
}
