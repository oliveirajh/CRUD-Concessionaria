public class Bicicleta extends Veiculo{
    private String tipoFreio;

    public Bicicleta(String tipoFreio, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(codigo, cor, marca, modelo, valor);
        this.tipoFreio = tipoFreio;
    }
}
