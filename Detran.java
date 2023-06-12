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
    // Metodo Construtor
    public Detran(){
        automoveis = new ArrayList<>(); 
        Carro joaop = new Carro("Amarok", "P0rt3", "Joao", "Preto"); // #1
        Carro ana = new Carro("Fusca", "1345", "Ana Verena", "Verde Cana"); // #2
        Moto thayna = new Moto("Honda XRE 300", "Goku", "Thayna", "Ciano"); // #3
        Moto ismael = new Moto("Honda CB 500x", "BUG", "ismael", "Preto"); // #4
        Moto well = new Moto("Bonneville Bobber", "JAVA", "Welignton", "Cinza com chamas"); // #5
        Carro jorge = new Carro("Camaro", "FOR", "Jorge", "Amarelo"); // #6
        Carro diego = new Carro("Golf", "M4r0mb4", "Diego", "Cinza"); // #7
        automoveis.add(joaop);
        automoveis.add(ana);
        automoveis.add(thayna);
        automoveis.add(ismael);
        automoveis.add(well);
        automoveis.add(jorge);
        automoveis.add(diego); // Adicionado os objetos motos e carros ao Array do Detran
    }
    // Metodo que cadastra o veiculo para o Usuario
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
                System.out.println("Carro cadastrada com sucesso!");
            } else if("Moto".equalsIgnoreCase(tipo)){
                Moto veiculo = new Moto(modelo, placa, nome_dono, cor);
                automoveis.add(veiculo);
                System.out.println("Moto cadastrada com sucesso!");
            } else {
                System.out.println("ERROR: Tipo de veiculo não existe.");
            }
        }
    }
    // Metodo para Alterar as informações cadastradas do veiculo no Detran, para o Usuario
    public void Alterar(){
        System.out.println("Bom dia! voce quer alterar as informações do seu veiculo, certo?");
        System.out.println("(0) - NÃO (1) - SIM");
        int option = scan.nextInt();
        if(option == 0){
            System.out.println("Voce andou até aqui para nada?! Ok Então bye bye");
        } else if(option == 1){
            System.out.print("Informe o nome do dono do carro: ");
            nome_dono = scan.nextLine();
            // buscando o veiculo pelo nome do dono
             Automovel veiculo = BuscaInterna(nome_dono);
            if(veiculo != null){
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
                    veiculo.setModelo(modelo);
                    veiculo.setPlaca(placa);
                    veiculo.setNome(nome_dono);
                    veiculo.setCor(cor);
                    System.out.println("Veiculo alterado com sucesso!");
                }
            } else {
                System.out.println("Não foi possivel encontrar o veiculo...");
            }
        } else {
            System.out.println("Opcao incorreta, digite 0 ou 1");
        } 
        
    }
    // Metodo que apaga o veiculo cadastrado no Detran
    public void Apagar(){
        // Busca o veiculo
        // E armazena na variavel veiculo o objeto veiculo
        Automovel veiculo = Buscar();
        // Remove do Array do Detran o veiculo!  
        automoveis.remove(veiculo);
        System.out.println("Veiculo apagado do Detran com sucesso");

    }
    // Metodo que busca o veiculo a partir da placa do carro para o Usuario
    public Automovel Buscar(){
        System.out.println("# Buscando o veiculo..");
        System.out.print("Insira a placa do carro: ");
        String placa = scan.nextLine();
        // for que percorre todo o array para encontrar o veiculo pela placa
        for (Automovel automovel : automoveis) {
            if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                // Imprimindo o veiculo encontrado de forma tabular os dados do veiculo
                System.out.println("Modelo | Placa | Dono | Cor|");
                System.out.println(automovel.getModelo()+" | " + automovel.getPlaca() +" | "+ automovel.getDono()+ " | "+ automovel.getCor());
                return automovel;
            }
        }
        System.out.println(placa+ "não encontrada");
        return null;
    }

    // Metodo que imprime todos os veiculos cadastrados no Detran
    public void MostrarTodos(){
        System.out.println("Lista de todos os carros cadastrados no Detran");
        System.out.println("Modelo | Placa | Dono | Cor|");
        for(Automovel automovel : automoveis){
            System.out.println(automovel.getModelo()+" | " + automovel.getPlaca() +" | "+ automovel.getDono()+ " | "+ automovel.getCor());
        }
    }

    // Metodo BuscaInterna é para o proprio sistema saber o veiculo cadastrado no Detran
    public Automovel BuscaInterna(String nome_dono){
        for (Automovel automovel : automoveis) {
            if (automovel.getDono().equalsIgnoreCase(nome_dono)) {
                // Imprimindo o veiculo encontrado de forma tabular os dados do veiculo
                return automovel;
            }
        }
        return null;
    }
}
