package com.luiz;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        
        Scanner ts = new Scanner(System.in);
        CatalogoVeiculos cat = new CatalogoVeiculos();
        
        System.out.println("   Menu de Consulta   ");
        System.out.println("1-consultar: placa");
        System.out.println("2-consultar: marca");
        System.out.println("3-consultar: ano de fabricação");
        System.out.println("4-consultar: tipo");
        System.out.println("0-Sair");
        System.out.println("________________________");
        
        String opcao = ts.nextLine();

        if(opcao.equals("1")){
            System.out.println("Digite a placa");
            String p = ts.nextLine();
            if(cat.consultaPorPlaca(p) == null){
                System.out.println("ERRO Nenhum veiculo encontrado");
            }
            else{
                System.out.println("Marca: " + cat.consultaPorPlaca(p).getMarca());
                System.out.println("Placa: " + cat.consultaPorPlaca(p).getPlaca());
                System.out.println("Ano: " + cat.consultaPorPlaca(p).getAno());
                System.out.println("Modelo: " + cat.consultaPorPlaca(p).getModelo());
                System.out.println("Preço: " + cat.consultaPorPlaca(p).getPreco());
            }
        }
        else if(opcao.equals("2")){
            System.out.println("Digite a marca");
            String m = ts.nextLine();
            if(cat.consultaPorMarca(m).isEmpty()){
                System.out.println("Erro nenhum veiculo encontrado");
            }
            else{
                for(Veiculo v : cat.consultaPorMarca(m)){
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Ano: " + v.getAno());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Preço: " + v.getPreco());
                }
            }
        }
        else if(opcao.equals("3")){
            System.out.println("Digite o ano");
            int a = ts.nextInt();
            if(cat.consultaPorAno(a).isEmpty()){
                System.out.println("Erro nenhum veiculo encontrado");
            }
            else{
                for(Veiculo v : cat.consultaPorAno(a)){
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Ano: " + v.getAno());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Preço: " + v.getPreco());
                }
            }
        }
        else if(opcao.equals("4")){
            System.out.println("Digite o tipo");
            System.out.println("1-Passeio");
            System.out.println("2-Passageiro");
            System.out.println("3-Utilitario");
            String t = ts.nextLine();
            if(cat.consultaPorTipo(t).isEmpty()){
                System.out.println("Erro nenhum veiculo encontrado");
            }
            else{
                for(Veiculo v : cat.consultaPorTipo(t)){
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Ano: " + v.getAno());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Preço: " + v.getPreco());
                }
            }
        }
        else{
            System.out.println("digito invalido");
            System.out.println("Programa encerrado");
            System.exit(0);
        }      
    }
}