import java.time.LocalDateTime;

public class Programa{
    public static void main(String args[]){
        System.out.println("#############");
        System.out.println("#MENU#");
        System.out.println("[1] - Bem-vindo ao estacionamento do GH Carros");
        System.out.println("[2] - Deseja estacionar um carro?");
        System.out.println("[3] - Deseja visualizar todos os carros já estacionados?");
        System.out.println("[4] - Deseja remover um carro do estacionamento?");
        System.out.println("[5] - Deseja procurar por um carro?");
        System.out.println("[0] - Fechar programa");
    }

    private String modelo;
    private String placa;
    private String nome_dono;
    private String cor;
    private LocalDateTime dataHora_entrada;

    public void Carro(String modelo, String placa, String nome_dono, String cor){
        this.modelo = modelo; // marca e modelo do carro
        this.placa = placa; // placa do carro
        this.nome_dono = nome_dono; // nome do dono do carro
        this.cor = cor; // cor do veiculo
        dataHora_entrada = LocalDateTime.now(); // pegar o horario da hora que o carro entrar no estacionamento
    }
}