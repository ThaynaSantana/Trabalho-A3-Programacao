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

    public void Cadastrar(){
        System.out.println("# Cadastrando o veiculo");
        System.out.print("Digite o modelo: ");
        modelo = scan.nextLine();
        System.out.print("Digite a placa: ");
        placa = scan.nextLine();
        System.out.print("Digite o nome do dono: ");
        nome_dono = scan.nextLine();
        System.out.print("Digite o cor: ");
        cor = scan.nextLine();
        System.out.print("Que tipo de veiculo é? (Carro ou Moto?): ");
        tipo = scan.nextLine();
        // Validação de todos os campos
        if (modelo == null || placa == null || nome_dono == null || cor == null || tipo == null){
            System.out.println("ERROR: Preencha todos os campos para cadastrar o veiculo no detran");
        } else {
            // Verificação se foi digitado um carro ou moto, so é validado esses dois tipos
            if("Carro".equalsIgnoreCase(tipo)){
                Carro veiculo = new Carro(modelo, placa, nome_dono, cor);
                automoveis.add(veiculo);
            } else if("Moto".equalsIgnoreCase(tipo)){
                Moto veiculo = new Moto(modelo, placa, nome_dono, cor);
                automoveis.add(veiculo);
            } else {
                System.out.println("ERROR: Tipo de veiculo não existe.");
            }
        }
    }

    public void Alterar(){
        System.out.println("Bom dia! voce quer alterar as informações do seu veiculo, certo?");
        System.out.println("(0) - NÃO\n (1) - SIM");
        int option = scan.nextInt();
        // validação se foi digitado 1 ou 0
        while(option != 1 || option != 0){
            if(option == 0){
                System.out.println("Voce andou até aqui para nada?! Ok Então bye bye");
            } else if(option == 1){
                System.out.print("Informe o nome do dono do carro: ");
                nome_dono = scan.nextLine();
                // buscando o veiculo pelo nome do dono
                for(Automovel automovel : automoveis){
                    if(nome_dono.equalsIgnoreCase(automovel.getDono())){
                        // Achou o veiculo!
                        System.out.println("Achei seu veiculo, agora vamos alterar e confirmar todos os dados.");
                        System.out.print("Digite o modelo: ");
                        modelo = scan.nextLine();
                        System.out.print("Digite a placa: ");
                        placa = scan.nextLine();
                        System.out.print("Digite o nome do dono: ");
                        nome_dono = scan.nextLine();
                        System.out.print("Digite o cor: ");
                        cor = scan.nextLine();
                        // Validação se todos os campos foram preenchidos
                        if (modelo == null || placa == null || nome_dono == null || cor == null || tipo == null){
                             System.out.println("ERROR: Preencha todos os campos para editar o veiculo no Detran");
                        } else {
                            automovel.setModelo(modelo);
                            automovel.setPlaca(placa);
                            automovel.setNome(nome_dono);
                            automovel.setCor(cor);
                            System.out.println("Veiculo alterado com sucesso!");
                        }
                    }
                }
                System.out.println("Não foi possivel encontrar o veiculo...");
            } else {
                System.out.println("Opcao incorreta, digite 0 ou 1");
            }
        }
    }

    public void Apagar(){
        // Busca o veiculo
        // E armazena na variavel veiculo o objeto veiculo
        Automovel veiculo = Buscar();
        // Remove do Array do Detran o veiculo!  
        automoveis.remove(veiculo);
        System.out.println("Veiculo apagado do Detran com sucesso");

    }

    public Automovel Buscar(){
        System.out.println("# Buscando o veiculo..");
        System.out.print("Insira a placa do carro: ");
        String placa = scan.nextLine();
        for (Automovel automovel : automoveis) {
            if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                return automovel;
            }
        }
        System.out.println(placa+ "não encontrada");
        return null;
    }
}
