import java.util.Scanner;

public class Automotor extends Veiculo{
    private String tipoCombustivel;

    Scanner scanner = new Scanner(System.in);
    public Automotor(){
        super();
        System.out.println("Digite o Tipo de Combutivel para o Carro \n G- Gasolina \n A- Alcool \n F- Flex \n E- Eletrico \n D- Diesel");
        this.tipoCombustivel = scanner.next();

        while(!(this.tipoCombustivel.contains("G")  || this.tipoCombustivel.contains("A") || this.tipoCombustivel.contains("F") || this.tipoCombustivel.contains("E") || this.tipoCombustivel.contains("D"))){
            System.out.println("Digite o Tipo de Combutivel para o Carro \n G- Gasolina \n A- Alcool \n F- Flex \n E- Eletrico \n D- Diesel");
            this.tipoCombustivel = scanner.next();
        }

    }
    public Automotor(String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(codigo, cor, marca, modelo, valor);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println(" Tipo Combustivel Atual: " + this.tipoCombustivel);
        System.out.println(" Digite o novo Tipo de Combutivel para o Veiculo \n G- Gasolina \n A- Alcool \n F- Flex \n E- Eletrico \n D- Diesel");
        this.tipoCombustivel = scanner.next();

        while(!(this.tipoCombustivel.contains("G")  || this.tipoCombustivel.contains("A") || this.tipoCombustivel.contains("F") || this.tipoCombustivel.contains("E") || this.tipoCombustivel.contains("D"))){
            System.out.println("Digite um valor Valido!");
            System.out.println(" Tipo Combustivel Atual: " + this.tipoCombustivel);
            System.out.println("Digite o Tipo de Combutivel para o Veiculo \n G- Gasolina \n A- Alcool \n F- Flex \n E- Eletrico \n D- Diesel");
            this.tipoCombustivel = scanner.next();
        }
    }

    @Override
    public void exibir(){
        super.exibir();
        System.out.println(" Tipo Combustivel: " + this.tipoCombustivel);
    }
}
