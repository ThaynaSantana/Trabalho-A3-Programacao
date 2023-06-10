import java.util.Scanner;

public class Programa{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        Estacionamento GH_carros = new Estacionamento(); // Criando um estacionamento 
        Detran detran = new Detran();  // Criando o detran

        System.out.println("=====MENU=====");
        System.out.println("Bem-vindo ao estacionamento do GH Carros");
        System.out.println("[1] - Deseja estacionar um carro?");
        System.out.println("[2] - Deseja visualizar todos os carros já estacionados?");
        System.out.println("[3] - Deseja remover um carro do estacionamento?");
        System.out.println("[4] - Deseja procurar por um carro?");
        System.out.println("[5] - Deseja ir ao DETRAN?");
        System.out.println("[0] - Fechar programa");
        int option = scan.nextInt();

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
                System.out.println("[0] - Voltar");
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
                        case 0:
                    }
                    System.out.println("=====DETRAN====");
                    System.out.println("[1] - Deseja Cadastrar um veiculo?");
                    System.out.println("[2] - Deseja apagar um veiculo?");
                    System.out.println("[3] - Deseja procurar por um veiculo?");
                    System.out.println("[0] - Voltar");
                    option_detran = scan.nextInt();
                }
                
            case 0:
                System.out.println("Sistema Finalizado.");
                break;
        }
    
    }

}