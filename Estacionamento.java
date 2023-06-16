import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estacionamento {
        
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        ArrayList<Veiculo> veiculos; // Array que guarda os veiculos estacionados
        LocalDateTime now;
        String data_hora_entrada; // Variavel que guarda a data e hora de entrada no estacionamento
        String data_hora_saida; // Variavel que guarda a data e hora de entrada no estacionamento
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy "); // formatador de data e hora (12:30:02 13/06/2023)
        Detran detran = new Detran(); // Instanciando o objeto Detran
        int vagas_disponiveis; // variavel que serve para fazer o controle de vagas disponivel

        public Estacionamento(){
            // Cria um array com somente 10 vagas;
            veiculos = new ArrayList<>(10);
            vagas_disponiveis = 10;
            System.out.println("Estacionamento criado com sucesso!");
            System.out.println("Vagas disponíveis: " + vagas_disponiveis);
        
        }

        public void Estacionar(){
            if(vagas_disponiveis == 0){
               System.out.println("Não há vagas disponíveis no momento!");
            } else {
                System.out.println("# Estacione o veiculo..");
                System.out.println("Digite o nome do dono do carro: ");
                String nome_dono = scan.nextLine(); // Scaneando o nome digitado
                Veiculo veiculo = detran.BuscaInterna(nome_dono); // Mostrando a hora e data de entrada e a descriçao do veiculo 
                if(veiculo != null){
                    now = LocalDateTime.now(); // pegando a data de entrada no momento do veiculo no estacionamento
                    data_hora_entrada = now.format(formater);
                    veiculo.setDataEntrada(data_hora_entrada); // setando o horario
                    System.out.println(data_hora_entrada+" - "+veiculo.getDescricao());
                    veiculos.add(veiculo);
                    System.out.println("Carro estacionado com sucesso!");
                    vagas_disponiveis--; // decremetando 1, que significa -1 vaga disponivei ;)
                } else {
                    System.out.println("Nenhum carro foi encontrado com nome do dono fornecido... veiculo não pode ser estacionado!");
                }
            }
            
        }

        public void Remover(){
            System.out.println("# Removendo o veiculo..");
            System.out.println("Digite o nome do dono do carro: ");
            String nome_dono = scan.nextLine(); // scaneando a placa digitada
            Veiculo veiculo = detran.BuscaInterna(nome_dono); // Buscando o veiculo pelo nome digitado 
            if(veiculo != null){
                System.out.println("Tem certeza que deseja remover o veiculo abaixo? (0- Não) (1 - Sim)");
                System.out.println(veiculo.getDescricao());
                System.out.print("> ");
                int opcao = scan.nextInt();
                if(opcao == 1){
                    now = LocalDateTime.now(); // pegando a data de entrada no momento do veiculo no estacionamento
                    String data_hora_saida = now.format(formater); // Pegando a data e hora no momento
                    veiculo.setDataSaida(data_hora_saida); // Setando a data e hora de saida
                    veiculos.remove(veiculo); // Removendo o veiculo do array
                    System.out.println(data_hora_saida+" - "+veiculo.getDescricao()); // Mostrando a hora e data de saida e a descriçao do veiculo 
                    System.out.println("Carro retirado do estacionamento com sucesso!");
                    vagas_disponiveis++; // incremetando 1, que significa 1+ vaga disponivel
                } else if(opcao == 0){
                    System.out.println("Nenhum veiculo foi removido.");
                } else {
                    System.out.println("ERROR: Só é aceito as seguintes opções 0 ou 1, (0- Não) (1 - Sim)");
                }
            } else {
                System.out.println("Placa incorreta... veiculo não pode ser retirado!");
            }
                
        } 
        

        // Metodo que altera as informaçoes do veiculo no detran
        public void AlterarInfo(){
            System.out.println("# Rapaz para voce alterar as informações voce vai ter que ir no detran..\nporque os sistemas hoje em dia é tudo automatico.\n Mas eu vou te ajudar, voce vai indo reto aqui, ai na primeira esquina vira a direita e voce vai ver um predio amarelo ESCRITO DETRAN bem grande\n É lá viu, Abraços!");
            System.out.println("*Andando até o detran...");
            detran.Alterar();
        }

        // Metodo que busca o veiculo pela placa e imprime na tela o veiculo
        public Veiculo Buscar(){
            System.out.println("# Buscando o veiculo..");
            System.out.print("Insira a placa do carro: ");
            String placa = scan.nextLine();
            for (Veiculo Veiculo : veiculos) {
                if (Veiculo.getPlaca().equalsIgnoreCase(placa)) {
                     System.out.println("Modelo | Placa | Dono | Cor|");
                    System.out.println(Veiculo.getModelo()+" | " + Veiculo.getPlaca() +" | "+ Veiculo.getDono()+ " | "+ Veiculo.getCor());
                    return Veiculo;
                }
             }
            System.out.println(placa+ "não encontrada");
            return null;
        }

        public static void ordenarPorNomeDono(ArrayList<Veiculo> veiculos) {
            // Colletions.sort() serve para ordenar um ArrayList
            // Comparator é um objeto que serve para comparar dois objetos dentro do array
            Collections.sort(veiculos, new Comparator<Veiculo>() {
                @Override
                public int compare(Veiculo obj1, Veiculo obj2) {
                    return obj1.getDono().compareTo(obj2.getDono()); // então aqui ele compara de fato dois objetos do tipo Veiculo pelo atributo nome do dono
                }
                /* Como funciona o compare()
                 *  Se obj1.getDono() for menor do que obj2.getDono(), o valor retornado será negativo.
                    Se obj1.getDono() for maior do que obj2.getDono(), o valor retornado será positivo.
                    Se obj1.getDono() for igual a obj2.getDono(), o valor retornado será zero.
                 */
            });
        }

        public void mostrarTodos(){
            ordenarPorNomeDono(veiculos); // chamando o metodo para ordernar o array por ordem alfabetica pelo atributo nome
            System.out.println("Modelo | Placa | Nome dono");
            for (Veiculo Veiculo : veiculos) {
                String[] info = Veiculo.getDescricao().split(" \\| "); // metodo getDescricao() retorna uma breve descricao do veiculo
                System.out.println(info[0] + " | " + info[1] + " | " + info[2]); // printando as informações de forma tabular
            }
        }
}
