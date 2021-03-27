package com.luiz;
import java.util.ArrayList;
import java.util.List;

public class CatalogoVeiculos {
    private List<Veiculo> veiculos;
    
    public CatalogoVeiculos() {
        this.veiculos = new ArrayList<>();
        veiculos.add(new VeiculoPasseio("BRA2E19", "Mitsubishi", "Lancer", 2020, 250150.5, 12.5));

        veiculos.add(new VeiculoUtilitario("RIO2A18", "Iveco", "Daily", 2019, 75000.0, 500, 2));

        veiculos.add(new VeiculoPassageiros("PBA2017", "Marcopolo", "Paradiso", 2017, 225749.5, 45));
    }
    
    public Veiculo consultaPorPlaca (String placa){
        for(Veiculo v : veiculos){
            if(v.getPlaca().equals(placa)){
                return v;
            }
        }
        return null;
    }

    public List<Veiculo> consultaPorMarca(String marca){
        List<Veiculo> mMarca = new ArrayList<Veiculo>();        
        for (Veiculo v : veiculos) {
            if (v.getMarca().equals(marca)) {
                mMarca.add(v);
            }
        }

        return mMarca; 
    }

    public List<Veiculo> consultaPorAno(int ano){
        List<Veiculo> mAno = new ArrayList<Veiculo>();        
        for (Veiculo v : veiculos) {
            if (v.getAno()==ano) {
                mAno.add(v);
            }
        }

        return mAno;
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        List<Veiculo> mTipo = new ArrayList<Veiculo>();
        if(tipo.equals("1")){
            for (Veiculo v : veiculos) {
                if (v instanceof VeiculoPasseio) {
                    mTipo.add(v);
                }
            }
        }    
        else if(tipo.equals("2")){
            for (Veiculo v : veiculos) {
                if (v instanceof VeiculoPassageiros) {
                    mTipo.add(v);
                }
            }
        }
        else if(tipo.equals("3")){
            for (Veiculo v : veiculos) {
                if (v instanceof VeiculoUtilitario) {
                    mTipo.add(v);
                }
            }
        }          
        return mTipo;
    }
}