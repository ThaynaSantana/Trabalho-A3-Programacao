public class Veiculo implements Comparable<Veiculo> {
    private String modelo, placa, nome_dono, cor, dataHora_entrada, dataHora_saida;
    private int tamanho;

    public Veiculo(String modelo, String placa, String nome_dono, String cor){
        this.modelo = modelo; // marca e modelo do Veiculocarro
        this.placa = placa; // placa do Veiculo
        this.nome_dono = nome_dono; // nome do dono do Veiculo
        this.cor = cor; // cor do Veiculo
        tamanho = 0; 
        dataHora_entrada = null; // horario de entrada como null porque nao foi estacionado o Veiculo ainda
        dataHora_saida = null; // horario de saida como null porque nao foi retirado o Veiculo ainda
    }

    public int compareTo(Veiculo outro) {
        return this.nome_dono.compareTo(outro.nome_dono);
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

    public String getHoraEntrada(){
        return dataHora_entrada;
    }

    public String getHoraSaida(){
        return dataHora_saida;
    }

    public void setModelo(String novo_modelo){
        modelo = novo_modelo;
    }

    public void setPlaca(String nova_placa){
        placa = nova_placa;
    }
    public void setCor(String nova_cor){
        cor = nova_cor;
    }
    
    public void setNome(String novo_nome){
        nome_dono = novo_nome;
    }

    public void setDataEntrada(String data_hora){
        this.dataHora_entrada = data_hora;
    }

    public void setDataSaida(String data_hora){
        this.dataHora_saida = data_hora;
    }
}
