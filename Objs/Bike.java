public class Bike extends Veiculo{
    private String modelo, placa, nome_dono, cor, dataHora_entrada, dataHora_saida;
    private int tamanho;

    public Bike(String modelo, String placa, String nome_dono, String cor){
        super(modelo, placa, nome_dono, cor);
        tamanho = 1;
        dataHora_entrada = null; // variavel =  o horario que o carro entrar no estacionamento
        dataHora_saida = null; // variavel = o horario que o carro sair no estacionamento
    }

}
