import java.time.LocalDateTime;
public class Carro extends Automovel {
    
    private String modelo;
    private String placa;
    private String nome_dono;
    private String cor;
    private Automovel tipo;
    private LocalDateTime dataHora_entrada;
    private LocalDateTime dataHora_saida;
    
    
    public Carro(String string, String string2, String string3, String string4) {
    }


    public void Carro(String modelo, String placa, String nome_dono, String cor){
        this.modelo = modelo; // marca e modelo do carro
        this.placa = placa; // placa do carro
        this.nome_dono = nome_dono; // nome do dono do carro
        this.cor = cor; // cor do veiculo
        this.tipo = Carro();
        dataHora_entrada = null; // pegar o horario da hora que o carro entrar no estacionamento
        dataHora_saida = null;
    }

}
