import java.time.LocalDateTime;
public class Carro extends Automovel {
    
    
    
    public void Carro(String modelo, String placa, String nome_dono, String cor){
        this.modelo = modelo; // marca e modelo do carro
        this.placa = placa; // placa do carro
        this.nome_dono = nome_dono; // nome do dono do carro
        this.cor = cor; // cor do veiculo
        this.tipo = Carro();
        dataHora_entrada = LocalDateTime.now(); // pegar o horario da hora que o carro entrar no estacionamento

    }

    
}
