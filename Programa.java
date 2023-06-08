import java.util.Scanner;

public class Programa{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        Estacionamento GH_carros = new Estacionamento(); // Criando um estacionamento 

        Carro thayna = new Carro("Fiesta 2010", "123", "Thayna", "Preto");

        System.out.println("#############");
        System.out.println("=====MENU====");
        System.out.println("Bem-vindo ao estacionamento do GH Carros");
        System.out.println("[1] - Deseja estacionar um carro?");
        System.out.println("[2] - Deseja visualizar todos os carros já estacionados?");
        System.out.println("[3] - Deseja remover um carro do estacionamento?");
        System.out.println("[4] - Deseja procurar por um carro?");
        System.out.println("[0] - Fechar programa");
        int option = scan.nextInt();

        switch (option){
            case 1:
                GH_carros.estacionar(thayna);
                break;
            case 2:
                GH_carros.mostrarTodosCarros();
                break;
            case 3:
                GH_carros.remover(Automovel veiculo);
                break;
            case 4:
                GH_carros.buscar(String dono);
                break;
            case 5:
                System.out.println("Sistema Finalizado.");
                break;
        }
    
    }

}