import java.util.Scanner;

public class Programa{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        Estacionamento GH_carros = new Estacionamento(); // Criando um estacionamento 
        Detran detran = new Detran();  // Criando o detran
        // Menu 
        System.out.println("=====MENU=====");
        System.out.println("Bem-vindo ao estacionamento do GH Carros");
        System.out.println("[1] - Deseja Estacionar um veiculo?");
        System.out.println("[2] - Deseja Visualizar TODOS os veiculos já estacionados?");
        System.out.println("[3] - Deseja Remover um veiculo do estacionamento?");
        System.out.println("[4] - Deseja Procurar por um veiculo?");
        System.out.println("[5] - Deseja ir ao DETRAN?");
        System.out.println("[6] - Deseja Alterar as informações do veiculo ?");
        System.out.println("[0] - Fechar programa");
        System.out.print("> ");
        int option = scan.nextInt();
        
        while(option != 0){
            switch (option){
                case 1:
                    GH_carros.Estacionar();
                    break;
                case 2:
                    GH_carros.mostrarTodos();
                    break;
                case 3:
                    GH_carros.Remover();
                    break;
                case 4:
                    GH_carros.Buscar();
                    break;
                case 5:
                    System.out.println("=====DETRAN====");
                    System.out.println("[1] - Deseja Cadastrar um veiculo?");
                    System.out.println("[2] - Deseja apagar um veiculo?");
                    System.out.println("[3] - Deseja procurar por um veiculo?");
                    System.out.println("[4] - Deseja Listar todos veiculos do Detran?");
                    System.out.println("[0] - Voltar");
                    System.out.print("> ");
                    int option_detran = scan.nextInt();
                    while(option_detran != 0){
                        switch(option_detran){
                            case 1:
                                detran.Cadastrar();
                                break;
                            case 2:
                                detran.Apagar();
                                break;
                            case 3:
                                detran.Buscar();
                                break;
                            case 4:
                                detran.MostrarTodos();
                                break;
                            case 0:
                                scan.close();
                                break;
                        }
                        System.out.println("=====DETRAN====");
                        System.out.println("[1] - Deseja Cadastrar um veiculo?");
                        System.out.println("[2] - Deseja apagar um veiculo?");
                        System.out.println("[3] - Deseja procurar por um veiculo?");
                        System.out.println("[4] - Deseja Listar todos veiculos do Detran?");
                        System.out.println("[0] - Voltar");
                        System.out.print("> ");
                        option_detran = scan.nextInt();
                    }
                    break;
                case 6:
                    GH_carros.AlterarInfo();
                    break;
                case 0:
                    System.out.println("Sistema Finalizado.");
                    scan.close();
                    break;
            }
            System.out.println("=====MENU=====");
            System.out.println("Bem-vindo ao estacionamento do GH Carros");
            System.out.println("[1] - Deseja Estacionar um veiculo?");
            System.out.println("[2] - Deseja Visualizar TODOS os veiculos já estacionados?");
            System.out.println("[3] - Deseja Remover um veiculo do estacionamento?");
            System.out.println("[4] - Deseja Procurar por um veiculo?");
            System.out.println("[5] - Deseja ir ao DETRAN?");
            System.out.println("[6] - Deseja Alterar as informações do veiculo ?");
            System.out.println("[0] - Fechar programa");
            System.out.print("> ");
            option = scan.nextInt();
        }
    }
}