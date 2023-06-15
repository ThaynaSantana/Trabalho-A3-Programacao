import java.time.LocalDateTime;
public class Carro extends Veiculo {
    
    private String modelo, placa, nome_dono, cor, dataHora_entrada, dataHora_saida;
    private int tamanho, cavalos;

    public Carro(String modelo, String placa, String nome_dono, String cor){
        super(modelo, placa, nome_dono, cor);
        tamanho = 2;
        cavalos = 480;
        //dataHora_entrada = null; // variavel =  o horario que o carro entrar no estacionamento
        //dataHora_saida = null; // variavel = o horario que o carro sair no estacionamento
    }

}
