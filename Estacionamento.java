import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Estacionamento {
        
        Scanner scan = new Scanner(System.in);

        public void Estacionamento(){
            ArrayList<Carro> carros; // Cria um array de carros
            System.out.println("Estacionamento Criado com sucesso!");
            System.out.println("Vagas disponiveis!");
        }

        public void Menu(){
            System.out.println("#############");
            System.out.println("#MENU#");
            System.out.println("[1] - Bem-vindo ao estacionamento do GH Carros");
            System.out.println("[2] - Deseja estacionar um carro?");
            System.out.println("[3] - Deseja visualizar todos os carros já estacionados?");
            System.out.println("[4] - Deseja remover um carro do estacionamento?");
            System.out.println("[5] - Deseja procurar por um carro?");
            System.out.println("[0] - Fechar programa");
            int option = scan.nextInt();
        }

        public void Estacionar(Automovel veiculo){
            System.out.println("# Estacionando veiculo...");
            System.out.print("Digite o nome do dono do carro: ");
            String nome_dono = scan.nextLine();
            Automovel.validarDono(nome_dono);
            LocalDateTime dataHora_entrada = LocalDateTime.now();
            System.out.println("Carro estacionado com sucesso!");
        }

        public void Remover(){
            System.out.println("# Removendo o veiculo");
            System.out.println("Digite o nome do dono do carro: ");
            String nome_dono = scan.nextLine();
            LocalDateTime dataHora_saida = LocalDateTime.now();
            System.out.println("Carro removido com sucesso!");
        }

        public void AlterarInfo(){
            System.out.println("# Alterando as informações veiculo");
        }

        public void Buscar(){
           
        }
        
}
