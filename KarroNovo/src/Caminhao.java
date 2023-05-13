public class Caminhao extends Automotor{
    private Double cargaMax;
    private Integer numEixos;

    public Caminhao(Double cargaMax, Integer numEixos, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.cargaMax = cargaMax;
        this.numEixos = numEixos;
    }
}
