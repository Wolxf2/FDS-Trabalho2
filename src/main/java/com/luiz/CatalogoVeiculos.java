package com.luiz;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.nio.file.Files;
import java.io.Reader;
import java.nio.file.Paths;

public class CatalogoVeiculos {
    private List<Veiculo> veiculos;


    private void carrega(String nome) {
        try (
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/com/luiz/resource/" + nome));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());
        ) {
                for (CSVRecord csv : csvParser) {
                String placa = csv.get(0);
                String marca = csv.get(1);
                String modelo = csv.get(2);
                int ano = Integer.parseInt(csv.get(3));
                double valor = Double.parseDouble(csv.get(4));

                if(nome.equals("VeiculoDePassageiros.csv")) {
                    int nroPass = Integer.parseInt(csv.get(5));
                    this.veiculos.add(new VeiculoPassageiros(placa, marca, modelo, ano, valor, nroPass));
                }

                if(nome.equals("VeiculoDePasseio.csv")) {
                    double consumoKmLt = Double.parseDouble(csv.get(5));
                    this.veiculos.add(new VeiculoPasseio(placa, marca, modelo, ano, valor, consumoKmLt));
                }

                if(nome.equals("VeiculoUtilitario.csv")) {
                    int capCargaKg = Integer.parseInt(csv.get(5));
                    int nroEixos = Integer.parseInt(csv.get(6));
                    this.veiculos.add(new VeiculoUtilitario(placa, marca, modelo, ano, valor, capCargaKg, nroEixos));
                }

            }
        }catch(Exception e) {
            System.err.println("ERRO");
        }
    }
    
    public CatalogoVeiculos() {
        this.veiculos = new ArrayList<>();
        carrega("VeiculoDePassageiros.csv");
        carrega("VeiculoDePasseio.csv");
        carrega("VeiculoUtilitario.csv");
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