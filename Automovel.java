import java.time.LocalDateTime;

public class Automovel {
    private String modelo;
    private String placa;
    private String nome_dono;
    private String cor;
    private int tamanho;
    private LocalDateTime dataHora_entrada;
    private LocalDateTime dataHora_saida;

    public Automovel(String modelo, String placa, String nome_dono, String cor){
        this.modelo = modelo; // marca e modelo do veiculocarro
        this.placa = placa; // placa do veiculo
        this.nome_dono = nome_dono; // nome do dono do veiculo
        this.cor = cor; // cor do veiculo
        tamanho = 0; 
        dataHora_entrada = null; // horario de entrada como null porque nao foi estacionado o veiculo ainda
        dataHora_saida = null; // horario de saida como null porque nao foi retirado o veiculo ainda
    }

    public String getDescricao(){
        return modelo + " | " + placa + " | " + nome_dono;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public String getDono(){
        return nome_dono;
    }

    public String getCor(){
        return cor;
    }

    public int getTamanho(){
        return tamanho;
    }


    public LocalDateTime getDataEntrada(){
        return dataHora_entrada;
    }

    public void setDataEntrada(LocalDateTime data_hora){
        this.dataHora_entrada = data_hora;
    }

    public void setDataSaida(LocalDateTime data_hora){
        this.dataHora_saida = data_hora;
    }
}
