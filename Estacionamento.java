import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Estacionamento {
        
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        ArrayList<Automovel> automoveis; // Array que guarda os automoveis estacionados
        LocalDateTime data_hora_entrada; // Variavel que guarda a data e hora de entrada no estacionamento
        LocalDateTime data_hora_saida; // Variavel que guarda a data e hora de entrada no estacionamento
        Detran detran = new Detran(); // Instanciando o objeto Detran


        public Estacionamento(){
            // Cria um array com somente 10 vagas;
            ArrayList<Automovel> automoveis = new ArrayList<Automovel>(10);
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

        public void Remover(){
            System.out.println("# Removendo o veiculo");
            
            System.out.println("Digite a placa do carro: ");
            String placa = scan.nextLine(); // scaneando a placa digitada
            for(Automovel automovel : automoveis){
                if(placa == automovel.getPlaca()){ // verificando se o nome digitado bate com o nome do dono do carro
                    data_hora_saida = LocalDateTime.now();
                    automovel.setDataSaida(data_hora_saida);
                    System.out.println("Carro encontrado e retirado com sucesso!");
                } 
            }
            System.out.println("Placa incorreta... veiculo não pode ser retirado!");
        }

        // Metodo que altera as informaçoes do veiculo no detran
        public void AlterarInfo(Automovel veiculo){
            System.out.println("# Rapaz para voce alterar as informações voce vai ter que ir no detran..\nporque os sistemas hoje em dia é tudo automatico.\n Mas eu vou te ajudar, voce vai indo reto aqui, ai na primeira esquina vira a direita e voce vai ver um predio amarelo ESCRITO DETRAN bem grande\n É lá viu, Abraços!");
            System.out.println("*Andando até o detran...");
            detran.Alterar();
        }

        // Metodo que busca o veiculo pela placa e imprime na tela o veiculo
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

        public void mostrarTodos(){
            System.out.println("Modelo | Placa | Nome dono");
            for (Automovel automovel : automoveis) {
            String[] info = automovel.getDescricao().split(" \\| ");
            System.out.println(info[0] + " | " + info[1] + " | " + info[2]);
            }
        }
}
