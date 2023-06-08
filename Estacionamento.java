import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Estacionamento {
        
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        ArrayList<Automovel> automoveis; // Array que guarda os automoveis estacionados
        LocalDateTime data_hora_entrada;
        LocalDateTime data_hora_saida;

        public void Estacionamento(){
            // Cria um array de carros
            System.out.println("Estacionamento Criado com sucesso!");
            System.out.println("Vagas disponiveis!");
        }


        public void Estacionar(Automovel veiculo){
            System.out.println("# Estacionando veiculo...");
            
            System.out.print("Digite o nome do dono do carro: ");
            String nome_dono = scan.nextLine(); // scaneando o nome digitado
            
            if(nome_dono == veiculo.getDono()){ // verificando se o nome digitado bate com o nome do dono do carro
                data_hora_entrada = LocalDateTime.now();
                veiculo.setDataEntrada(data_hora_entrada);
                System.out.println("Carro estacionado com sucesso!");
            } else {
                System.out.println("Dono incorreto... veiculo não pode ser estacionado!");
            }
            
        }

        public void Remover(Automovel veiculo){
            System.out.println("# Removendo o veiculo");
            
            System.out.println("Digite o nome do dono do carro: ");
            String nome_dono = scan.nextLine(); // scaneando o nome digitado

            if(nome_dono == veiculo.getDono()){ // verificando se o nome digitado bate com o nome do dono do carro
                data_hora_saida = LocalDateTime.now();
                veiculo.setDataSaida(data_hora_saida);
                System.out.println("Carro retirado com sucesso!");
            } else {
                System.out.println("Dono incorreto... veiculo não pode ser retirado!");
            }

        }

        public void AlterarInfo(){
            System.out.println("# Alterando as informações veiculo");
        }

        public Automovel Buscar(String placa){
            System.out.println("# Buscando o veiculo..");
            for (Automovel automovel : automoveis) {
                if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                    return automovel;
                }
             }
            System.out.println(placa+ "não encontrada");
            return null;
        }
}
