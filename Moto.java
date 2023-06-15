import java.time.LocalDateTime;
public class Moto extends Automovel {
    
    private String modelo, placa, nome_dono, cor, dataHora_entrada,dataHora_saida;
    private int tamanho, cilindradas;

    public Moto(String modelo, String placa, String nome_dono, String cor){
        super(modelo, placa, nome_dono, cor);
        tamanho = 1;
        cilindradas = 1000;
        dataHora_entrada = null; // variavel =  o horario que o carro entrar no estacionamento
        dataHora_saida = null; // variavel = o horario que a Moto sair no estacionamento
    }

}
