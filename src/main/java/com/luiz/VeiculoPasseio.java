package com.luiz;
public class VeiculoPasseio extends VeiculoNormal{
    
    private double consumoKmLt;

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double preco, double consumoKmLt) {
        super(placa, marca, modelo, ano, preco);
        this.consumoKmLt = consumoKmLt;
    }

    public double getConsumoKmLt() {
        return consumoKmLt;
    }

    /*
    public void setConsumoKmLt(double consumoKmLt) {
        this.consumoKmLt = consumoKmLt;
    }
    */

    @Override
    public String toString() {
        return "consumoKmLt= " + consumoKmLt;
    }
}
