import java.util.ArrayList;
import java.util.Scanner;

public class Detran {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Automovel> automoveis;
    private String modelo;
    private String placa;
    private String nome_dono;
    private String cor;
    private String tipo;
    private Automovel veiculo;

    public Detran(){
        ArrayList<Automovel> automoveis;
    }

    public void Cadastrar(String modelo, String placa, String nome_dono, String cor, String tipo){
        // Validação de todos os campos
        if (modelo == null || placa == null || nome_dono == null || cor == null || tipo == null){
            System.out.println("ERROR: Preencha todos os campos para cadastrar o veiculo no detran");
        } else {
            if("Carro".equalsIgnoreCase(tipo)){
                Carro veiculo = new Carro(modelo, placa, nome_dono, cor);
                automoveis.add(veiculo);
            } else if("Moto".equalsIgnoreCase(tipo)){
                Moto veiculo = new Moto(modelo, placa, nome_dono, cor);
                automoveis.add(veiculo);
            } else {
                System.out.println("ERROR: Tipo de veiculo não existe");
            }
        }
    }

    public void Alterar(){
        System.out.println("Bom dia! voce quer alterar as informações do seu veiculo certo?");
        System.out.println("(0) - NÃO\n (1) - SIM");
        int option = scan.nextInt();
        while(option != 1 || option != 0){
            if(option == 0){
                System.out.println("Voce andou até aqui para nada?! Ok Então bye bye");
            } else if(option == 1){
                System.out.println("Informe o nome do dono do carro");
                
            } else {
                System.out.println("Opcao incorreta, digite 0 ou 1");
            }
        }
    }
}
