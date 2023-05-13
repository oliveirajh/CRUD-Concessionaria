public class Caminhao extends Automotor{
    private Double cargaMax;
    private Integer numEixos;

    public Caminhao(){
        super();
        System.out.println("Digite a carga maxima do veiculo: ");
        this.cargaMax = scanner.nextDouble();
        System.out.println("Digite a quantidade de eixos do veiculo: ");
        this.numEixos = scanner.nextInt();
        this.exibir();
    }
    public Caminhao(Double cargaMax, Integer numEixos, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.cargaMax = cargaMax;
        this.numEixos = numEixos;
    }

    public void editar(){
        super.editar();
        System.out.println(" Carga maxima atual: " + this.cargaMax);
        System.out.println(" Digite a nova carga maxima do veiculo: ");
        this.cargaMax = scanner.nextDouble();
        System.out.println(" Quantidade de eixos atuais: " + this.numEixos);
        System.out.println(" Digite a nova quantidade de eixos do veiculo: ");
        this.numEixos = scanner.nextInt();

    }
    @Override
    public void exibir(){
        System.out.println("--------Esse é um Caminhao-------");
        super.exibir();
        System.out.println(" Carga Maxima: " + this.numEixos + "KG");
        System.out.println(" Quantidade de eixos: " + this.cargaMax);
    }
}
