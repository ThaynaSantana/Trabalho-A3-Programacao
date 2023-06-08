import java.time.LocalDateTime;

public class Automovel {
    private String modelo;
    private String placa;
    private String nome_dono;
    private String cor;
    private Automovel tipo;
    private LocalDateTime dataHora_entrada;
    private LocalDateTime dataHora_saida;

    public void Automovel(String modelo, String placa, String nome_dono, String cor, Automovel tipo){
        this.modelo = modelo; // marca e modelo do veiculocarro
        this.placa = placa; // placa do veiculo
        this.nome_dono = nome_dono; // nome do dono do veiculo
        this.cor = cor; // cor do veiculo
        this.tipo = tipo; // tipo de veiculos: carro ou moto.....
        dataHora_entrada = null; // pegar o horario da hora que o veiculo entrar no estacionamento
        dataHora_saida = null; // horario de saida como null porque nao foi retirado o veiculo ainda
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

    public Automovel getTipo(){
        return tipo;
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
