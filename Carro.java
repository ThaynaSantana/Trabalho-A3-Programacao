import java.time.LocalDateTime;
public class Carro extends Automovel {
    
    private String modelo;
    private String placa;
    private String nome_dono;
    private String cor;
    private int tamanho;
    private LocalDateTime dataHora_entrada;
    private LocalDateTime dataHora_saida;
    

    public Carro(String modelo, String placa, String nome_dono, String cor){
        super(modelo, placa, nome_dono, cor);
        tamanho = 2;
        //dataHora_entrada = null; // variavel =  o horario que o carro entrar no estacionamento
        //dataHora_saida = null; // variavel = o horario que o carro sair no estacionamento
    }

}
