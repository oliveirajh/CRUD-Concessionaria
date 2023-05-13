public class Bicicleta extends Veiculo{
    private String tipoFreio;

    public Bicicleta(){
        super();
        System.out.println("Digite o Tipo de Freio para a Bicicleta \n C- Cantilever \n V- V-Brake \n F- Ferradura \n M- Disco Mecanico \n H- Disco Hidraulico");
        this.tipoFreio = scanner.next();

        while(!(this.tipoFreio.contains("C")  || this.tipoFreio.contains("V") || this.tipoFreio.contains("F") || this.tipoFreio.contains("M") || this.tipoFreio.contains("H"))){
            System.out.println("Digite o Tipo de Freio para a Bicicleta \n C- Cantilever \n V- V-Brake \n F- Ferradura \n M- Disco Mecanico \n H- Disco Hidraulico");
            this.tipoFreio = scanner.next();
        }
        this.exibir();
    }
    public Bicicleta(String tipoFreio, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(codigo, cor, marca, modelo, valor);
        this.tipoFreio = tipoFreio;
    }

    public void editar(){
        super.editar();
        System.out.println(" Tipo de Freio Atual: " + this.tipoFreio);
        System.out.println(" Digite o novo Tipo de Freio para a Bicicleta \n C- Cantilever \n V- V-Brake \n F- Ferradura \n M- Disco Mecanico \n H- Disco Hidraulico");
        this.tipoFreio = scanner.next();

        while(!(this.tipoFreio.contains("C")  || this.tipoFreio.contains("V") || this.tipoFreio.contains("F") || this.tipoFreio.contains("M") || this.tipoFreio.contains("H"))){
            System.out.println("Digite um valor Valido!");
            System.out.println(" Tipo Combustivel Atual: " + this.tipoFreio);
            System.out.println("Digite o Tipo de Freio para a Bicicleta \n C- Cantilever \n V- V-Brake \n F- Ferradura \n M- Disco Mecanico \n H- Disco Hidraulico");
            this.tipoFreio = scanner.next();
        }
    }

    public void exibir(){
        System.out.println("--------Essa é uma bicicleta-------");
        super.exibir();
        System.out.println(" Tipo de Freio: " + this.tipoFreio);
    }
}
